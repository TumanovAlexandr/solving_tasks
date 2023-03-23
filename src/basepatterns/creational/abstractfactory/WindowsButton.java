package basepatterns.creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("WindowsButton.");
    }
}
