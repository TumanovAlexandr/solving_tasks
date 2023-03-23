package basepatterns.creational.builder;

public class DesktopBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("256GB SSD + 1TB HDD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
