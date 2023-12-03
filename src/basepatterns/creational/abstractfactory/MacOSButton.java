package basepatterns.creational.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOSButton.");
    }
}
