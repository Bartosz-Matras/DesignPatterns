package pl.matrasbartosz.decorator_pattern;

class PotatoMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("Preparing meal with potatoes.");
    }
}
