package zaur.multithreading;

public class DaemonEx {
}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + isDaemon());
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(3000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

