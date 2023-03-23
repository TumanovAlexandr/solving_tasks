package basepatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espressoWithMilk = new Milk(new Espresso());

        System.out.println(espressoWithMilk.getDescription() + " - $" + espressoWithMilk.getCost());
    }
}
