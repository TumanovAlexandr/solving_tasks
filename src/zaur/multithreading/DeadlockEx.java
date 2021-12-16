package zaur.multithreading;

public class DeadlockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("t10 1");
        synchronized (DeadlockEx.lock1) {
            System.out.println("t10 2");
            synchronized (DeadlockEx.lock2) {
                System.out.println("t10 1 2");
            }

        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("t20 1");
        synchronized (DeadlockEx.lock2) {
            System.out.println("t20 2");
            synchronized (DeadlockEx.lock1) {
                System.out.println("t20 1 2");
            }

        }
    }
}