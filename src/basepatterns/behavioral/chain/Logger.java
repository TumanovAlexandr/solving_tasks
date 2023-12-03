package basepatterns.behavioral.chain;

public abstract class Logger {
    private Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void logMessage(int level, String message) {
        if (level <= getLogLevel()) {
            writeMessage(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }

    protected abstract void writeMessage(String message);
    protected abstract int getLogLevel();
}
