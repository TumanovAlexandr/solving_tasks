package zaur.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() {
        try {
            Thread.sleep(2000);
            System.out.println("Market ->");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void everythingIsReady() {
        try {
            Thread.sleep(3000);
            System.out.println("Ready ->");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openMarket() {
        try {
            Thread.sleep(4000);
            System.out.println("Open ->");
            countDownLatch.countDown();
            System.out.println("countDownLatch = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Friend("Alex", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Viktor", countDownLatch);
        new Friend("Marina", countDownLatch);
        new Friend("Anton", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " buying");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
