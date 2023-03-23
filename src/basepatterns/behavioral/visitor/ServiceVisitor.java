package basepatterns.behavioral.visitor;

public class ServiceVisitor implements Visitor {
    @Override
    public void visit(Car car) {
        System.out.println("Service for Car");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Service for Bike");
    }
}
