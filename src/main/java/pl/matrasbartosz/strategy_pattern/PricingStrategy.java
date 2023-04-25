package pl.matrasbartosz.strategy_pattern;

interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
