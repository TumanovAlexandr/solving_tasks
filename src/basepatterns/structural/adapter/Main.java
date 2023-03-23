package basepatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new ConsolePrinterAdapter();
        printer.print("Hello World!");
    }
}
