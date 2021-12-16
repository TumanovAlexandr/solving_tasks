package zaur.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static long value = 1_000_000_000L;

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        long valueDividedBy10 = value / 10;

        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = ex.submit(task);
            futures.add(futurePartSum);
        }

        long sum = futures
                .stream()
                .mapToLong(el -> {
                    try {
                        return el.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return 0;
                })
                .sum();

        ex.shutdown();
        System.out.println(sum);
    }

}

class PartialSum implements Callable<Long> {

    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}