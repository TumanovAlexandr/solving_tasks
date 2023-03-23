package basepatterns.behavioral.chain;

public class ErrorLogger extends Logger {
    @Override
    protected void writeMessage(String message) {
        System.out.println("Error Logger: " + message);
    }

    @Override
    protected int getLogLevel() {
        return 3;
    }
}
