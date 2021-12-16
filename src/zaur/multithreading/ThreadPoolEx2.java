package zaur.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImp200());
//        }
//        scheduledExecutorService.schedule(new RunnableImp200(), 3, TimeUnit.SECONDS);

//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();
    }
}

class RunnableImp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("end");
    }
}
