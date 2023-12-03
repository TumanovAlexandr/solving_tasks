package basepatterns.behavioral.chain;

public class FileLogger extends Logger {
    @Override
    protected void writeMessage(String message) {
        System.out.println("File Logger: " + message);
    }

    @Override
    protected int getLogLevel() {
        return 2;
    }
}
