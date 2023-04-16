package pl.matrasbartosz.factory_pattern;

class Main {

    public static void main(String[] args) {
        Factory commonwealthFactory = CommonwealthFactory.getInstance();
        Factory continentalFactory = ContinentalFactory.getInstance();

        Car bmw = commonwealthFactory.buildBmw(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());

    }
}
