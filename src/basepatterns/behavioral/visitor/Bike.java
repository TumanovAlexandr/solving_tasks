package basepatterns.behavioral.visitor;

public class Bike implements Vehicle {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
