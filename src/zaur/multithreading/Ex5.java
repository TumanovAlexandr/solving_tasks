package zaur.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Hi"));
        thread1.setName("my");
        System.out.println(thread1.getName());
        System.out.println(thread1.getPriority());
    }
}
