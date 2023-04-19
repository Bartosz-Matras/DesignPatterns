package pl.matrasbartosz.decorator_pattern;

class Main {

    public static void main(String[] args) {

        System.out.println("New meal: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();
        System.out.println("\nNew meal: ");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();
        System.out.println("\nNew meal: ");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();
    }
}
