package basepatterns.behavioral.chain;

public class ConsoleLogger extends Logger {
    @Override
    protected void writeMessage(String message) {
        System.out.println("Console Logger: " + message);
    }

    @Override
    protected int getLogLevel() {
        return 1;
    }
}
