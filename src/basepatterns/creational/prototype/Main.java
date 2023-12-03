package basepatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(10, 20);
        Shape rectangle2 = rectangle1.clone();

        rectangle1.draw();
        rectangle2.draw();
    }
}
