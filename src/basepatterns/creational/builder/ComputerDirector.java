package basepatterns.creational.builder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
    }
}
