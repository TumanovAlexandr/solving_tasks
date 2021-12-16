package zaur.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        new Person("Alex", semaphore);
        new Person("Anton", semaphore);
        new Person("Oleg", semaphore);
        new Person("Marina", semaphore);
        new Person("Sveta", semaphore);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + "...");
            semaphore.acquire();
            System.out.println(name + " call");
            sleep(2000);
            System.out.println(name + " finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
