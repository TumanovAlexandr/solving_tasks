package basepatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        if (System.getProperty("os.name").equals("Windows 10")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Button button = factory.createButton();
        button.paint();
    }
}
