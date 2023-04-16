package pl.matrasbartosz.factory_pattern;

public class ContinentalFactory extends Factory {
    private static ContinentalFactory instance;

    private ContinentalFactory() {}

    public static ContinentalFactory getInstance() {
        if (instance == null) {
            instance = new ContinentalFactory();
        }
        return instance;
    }

    @Override
    public BMW buildBmw(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5 -> {
                return new BMW(3.0, 2018, "Gas", "RIGHT");
            }
            case E60 -> {
                return new BMW(2.0, 2015, "Gas", "RIGHT");
            }
            default -> throw new UnsupportedOperationException("Unsupported type of BMW");
        }
    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX -> {
                return new Ford(2.5, 2011, "Gas", "RIGHT");
            }
            case FOCUS -> {
                return new Ford(1.8, 2007, "Gas", "RIGHT");
            }
            default -> throw new UnsupportedOperationException("Unsupported type of FORD");
        }
    }
}
