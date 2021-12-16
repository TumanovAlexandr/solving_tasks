package zaur.multithreading;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hi")).start();
    }
}
