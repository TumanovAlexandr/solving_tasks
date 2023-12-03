package basepatterns.structural.adapter;

public class ConsolePrinter implements PrinterInterface {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
