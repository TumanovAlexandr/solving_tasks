package zaur.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Alex", lock);
        new Employee("Anton", lock);
    }

}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ...");
            lock.lock();
            System.out.println(name + " work");
            Thread.sleep(2000);
            System.out.println(name + " done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
