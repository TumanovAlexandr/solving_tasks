package basepatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new DesktopBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        director.construct();
        Computer computer = builder.getResult();
        computer.print();
    }
}
