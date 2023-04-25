package pl.matrasbartosz.strategy_pattern;

class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("User singed up for the newsletter, you should select another price strategy!");
        }else {
            System.out.println("Normal price: " + price);
        }
    }
}
