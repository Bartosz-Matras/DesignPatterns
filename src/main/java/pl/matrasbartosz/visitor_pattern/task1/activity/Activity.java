package pl.matrasbartosz.visitor_pattern.task1.activity;

import pl.matrasbartosz.visitor_pattern.task1.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}
