package test_task;

public class App14 {
    public static void main(String[] args) {
        // Check RuntimeException
        try {
            throw new RuntimeException("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t) {
            System.out.println("Throwable");
        }
    }
}
