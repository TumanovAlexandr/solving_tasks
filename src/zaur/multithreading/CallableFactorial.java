package zaur.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> submit = ex.submit(factorial2);
        try {
            System.out.println("->");
            factorialResult = submit.get();
            System.out.println("<-");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.getCause();
        } finally {
            ex.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("noop");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
