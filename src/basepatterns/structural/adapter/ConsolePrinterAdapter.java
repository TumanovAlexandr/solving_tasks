package basepatterns.structural.adapter;

public class ConsolePrinterAdapter implements PrinterInterface {
    private ConsolePrinter consolePrinter = new ConsolePrinter();

    @Override
    public void print(String text) {
        consolePrinter.print(text);
    }
}
