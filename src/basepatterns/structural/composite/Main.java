package basepatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Component rectangle = new Rectangle();
        Component circle = new Circle();
        Composite composite = new Composite();

        composite.addComponent(rectangle);
        composite.addComponent(circle);

        composite.draw();
    }
}
