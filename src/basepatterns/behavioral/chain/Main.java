package basepatterns.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ErrorLogger();
        Logger logger1 = new FileLogger();
        Logger logger2 = new ConsoleLogger();

        logger.setNext(logger1);
        logger1.setNext(logger2);

        logger.logMessage(1, "All is OK");
        logger.logMessage(2, "File is corrupted");
        logger.logMessage(3, "System is down");
    }
}
