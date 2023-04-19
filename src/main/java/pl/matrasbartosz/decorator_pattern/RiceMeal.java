package pl.matrasbartosz.decorator_pattern;

class RiceMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("Preparing meal with rice.");
    }
}
