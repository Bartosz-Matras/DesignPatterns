package pl.matrasbartosz.strategy_pattern;

class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("User is not signed up for the newsletter, you should select another price strategy!");
        }else {
            System.out.println("Sale price: " + price/2);
        }
    }
}
