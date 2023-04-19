package pl.matrasbartosz.decorator_pattern;

class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Add shrimps to meal.");
    }
}
