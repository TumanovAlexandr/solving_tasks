package basepatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape greenRectangle = new Rectangle(new GreenColor());

        System.out.println(redCircle.draw());
        System.out.println(greenRectangle.draw());
    }
}
