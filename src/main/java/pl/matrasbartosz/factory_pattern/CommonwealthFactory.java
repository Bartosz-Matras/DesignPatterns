package pl.matrasbartosz.factory_pattern;

public class CommonwealthFactory extends Factory {

    private static CommonwealthFactory instance;

    private CommonwealthFactory() {}

    public static CommonwealthFactory getInstance() {
        if (instance == null) {
            instance = new CommonwealthFactory();
        }
        return instance;
    }

    @Override
    public BMW buildBmw(BMWModel bmwModel) {
        switch (bmwModel) {
            case X5 -> {
                return new BMW(3.0, 2018, "Gas", "LEFT");
            }
            case E60 -> {
                return new BMW(2.0, 2015, "Gas", "LEFT");
            }
            default -> throw new UnsupportedOperationException("Unsupported type of BMW");
        }
    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX -> {
                return new Ford(2.5, 2011, "Gas", "LEFT");
            }
            case FOCUS -> {
                return new Ford(1.8, 2007, "Gas", "LEFT");
            }
            default -> throw new UnsupportedOperationException("Unsupported type of FORD");
        }
    }
}
