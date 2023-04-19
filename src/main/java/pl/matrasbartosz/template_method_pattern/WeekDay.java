package pl.matrasbartosz.template_method_pattern;

abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    protected abstract void work();
    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    protected void summary(int time) {
        System.out.println("Trip takes " + time + " minutes.");
    }

    private void getReady() {
        System.out.println("Getting ready to work.");
    }

    private void wakeUp() {
        System.out.println("Wake up");
    }

    private void goHome() {
        System.out.println("Go home.");
    }

}
