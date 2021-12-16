package zaur.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        InterruptionThread interruptionThread = new InterruptionThread();
        interruptionThread.start();
        Thread.sleep(2000);
        interruptionThread.interrupt();
        interruptionThread.join();
        System.out.println("main stop");
    }
}

class InterruptionThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("interrupted");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
