package pl.matrasbartosz.visitor_pattern.task2.transport;

import pl.matrasbartosz.visitor_pattern.task2.visitor.TransportVisitor;

public interface Transportable {
    void accept(TransportVisitor transportVisitor);
}
