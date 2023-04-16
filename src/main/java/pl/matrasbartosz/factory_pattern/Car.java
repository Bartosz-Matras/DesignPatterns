package pl.matrasbartosz.factory_pattern;

abstract class Car {

    private double engineCapacity;
    private int productionYear;
    private String fuelType;
    private String steeringWheelPosition;

    protected Car(double engineCapacity, int productionYear, String fuelType, String steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
