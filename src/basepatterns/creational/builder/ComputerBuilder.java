package basepatterns.creational.builder;

public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    Computer getResult();
}
