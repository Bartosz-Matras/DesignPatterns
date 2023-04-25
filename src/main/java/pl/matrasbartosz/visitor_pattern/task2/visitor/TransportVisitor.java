package pl.matrasbartosz.visitor_pattern.task2.visitor;

import pl.matrasbartosz.visitor_pattern.task2.transport.Animal;
import pl.matrasbartosz.visitor_pattern.task2.transport.Person;
import pl.matrasbartosz.visitor_pattern.task2.transport.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
