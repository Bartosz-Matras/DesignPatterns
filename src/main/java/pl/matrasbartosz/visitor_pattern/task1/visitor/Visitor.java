package pl.matrasbartosz.visitor_pattern.task1.visitor;

import pl.matrasbartosz.visitor_pattern.task1.activity.Squash;
import pl.matrasbartosz.visitor_pattern.task1.activity.Treadmill;
import pl.matrasbartosz.visitor_pattern.task1.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Weights weights);
    void visit(Squash squash);
}
