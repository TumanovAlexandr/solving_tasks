package zaur.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
//    static int counter;

    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
//        counter++;
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp());
        Thread thread2 = new Thread(new MyRunnableImp());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImp implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
