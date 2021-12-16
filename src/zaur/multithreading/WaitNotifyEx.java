package zaur.multithreading;

public class WaitNotifyEx {

}

class Marker {
    private int breadCount;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println(" -1 ");
        System.out.println("total: " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println(" +1 ");
        System.out.println("total: " + breadCount);
        notify();
    }

    public static void main(String[] args) {
        Marker marker = new Marker();
        Producer producer = new Producer(marker);
        Consumer consumer = new Consumer(marker);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();

    }

}

class Producer implements Runnable {

    private Marker marker;

    public Producer(Marker marker) {
        this.marker = marker;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            marker.putBread();
        }
    }
}

class Consumer implements Runnable {

    private Marker marker;

    public Consumer(Marker marker) {
        this.marker = marker;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            marker.getBread();
        }
    }
}
