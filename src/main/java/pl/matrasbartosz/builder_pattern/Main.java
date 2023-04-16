package pl.matrasbartosz.builder_pattern;

class Main {

    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();
        System.out.println(flightLeg);

        FlightLeg flightLeg2 = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").build();
        System.out.println(flightLeg2);
    }
}
