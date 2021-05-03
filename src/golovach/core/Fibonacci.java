package golovach.core;

public class Fibonacci {
    public static void main(String[] args) {
        fib(5);
    }

    private static int fib(int i) {
        System.out.print(" " + i);
        int result = i < 2 ? 1 : fib(i - 2) + fib(i - 1);
        return result;
    }
}
