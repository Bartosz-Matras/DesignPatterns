package pl.matrasbartosz.template_method_pattern;

class Main {

    public static void main(String[] args) {
        WeekDay firstDay = new MyDay();
        firstDay.everyDayIsExactlyTheSame(TypeOfTransport.CAR);
        System.out.println();

        WeekDay secondDay = new MyDay();
        secondDay.everyDayIsExactlyTheSame(TypeOfTransport.TRAM);
        System.out.println();

        WeekDay thirdDay = new MyDay();
        thirdDay.everyDayIsExactlyTheSame(TypeOfTransport.BIKE);
        System.out.println();

        WeekDay fourthDay = new MyDay();
        fourthDay.everyDayIsExactlyTheSame(TypeOfTransport.ON_FOOT);
        System.out.println();
    }
}
