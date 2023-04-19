package pl.matrasbartosz.decorator_pattern;

abstract class MealDecorator extends Meal {

    private Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
