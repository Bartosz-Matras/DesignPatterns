package pl.matrasbartosz.template_method_pattern;

class MyDay extends WeekDay {
    @Override
    protected void work() {
        System.out.println("Code monkey get up, get coffe.");
    }

    @Override
    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case CAR -> {
                System.out.println("By car.");
                return 10;
            }
            case BIKE -> {
                System.out.println("By bike.");
                return 25;
            }
            case TRAM -> {
                System.out.println("By tram.");
                return 15;
            }
            default -> {
                System.out.println("On foot.");
                return 20;
            }
        }
    }
}
