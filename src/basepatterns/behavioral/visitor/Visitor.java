package basepatterns.behavioral.visitor;

public interface Visitor {
    void visit(Car car);
    void visit(Bike bike);
}
