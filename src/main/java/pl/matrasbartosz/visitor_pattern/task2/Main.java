package pl.matrasbartosz.visitor_pattern.task2;

import pl.matrasbartosz.visitor_pattern.task2.transport.Animal;
import pl.matrasbartosz.visitor_pattern.task2.transport.Person;
import pl.matrasbartosz.visitor_pattern.task2.transport.Shipment;
import pl.matrasbartosz.visitor_pattern.task2.transport.Transportable;
import pl.matrasbartosz.visitor_pattern.task2.visitor.NameTransportVisitor;
import pl.matrasbartosz.visitor_pattern.task2.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 30);
        Person customer = new Person("Bartosz", "Matras", false);
        Person regularCustomer = new Person("Kacper", "Nowak", true);
        Shipment smallShipment = new Shipment("PL", "2313131", false);
        Shipment largeShipment = new Shipment("PL", "9999999", true);
        List<Transportable> transportableList = Arrays.asList(animal, customer, regularCustomer, smallShipment, largeShipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
        System.out.println("---------------------------------------");
        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
    }
}
