package basepatterns.structural.flyweight;

public class Circle implements Shape{
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of color " + color);
    }
}
