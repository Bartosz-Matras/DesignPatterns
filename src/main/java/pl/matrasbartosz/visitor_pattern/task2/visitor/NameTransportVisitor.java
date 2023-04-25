package pl.matrasbartosz.visitor_pattern.task2.visitor;

import pl.matrasbartosz.visitor_pattern.task2.transport.Animal;
import pl.matrasbartosz.visitor_pattern.task2.transport.Person;
import pl.matrasbartosz.visitor_pattern.task2.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Animal: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment: " + shipment.getPrefix() + " " + shipment.getSerialNumber());
    }
}
