package zaur.collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integers.add(i);
        }
        List<Integer> syncIntegers = Collections.synchronizedList(integers);
        Runnable runnable1 = () -> {
            synchronized (syncIntegers) {
                Iterator<Integer> iterator = syncIntegers.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> syncIntegers.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(syncIntegers);
    }
}
