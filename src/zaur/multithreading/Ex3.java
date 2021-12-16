package zaur.multithreading;

public class Ex3 {
    public static void main(String[] args) {
        Thread thread3 = new Thread(new MyThread3());
        Thread thread4 = new Thread(new MyThread4());

        thread3.start();
        thread4.start();
    }
}

class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}