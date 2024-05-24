package test_task;

import java.util.ArrayList;
import java.util.List;

public class App30 {

    public static void main(String[] args) {
        // Test case 1
        int low1 = 100;
        int high1 = 300;
        System.out.println("Test case 1:");
        System.out.println("Input: low = 100, high = 300");
        System.out.println("Expected output: [123, 234]");
        System.out.println("Actual output: " + sequentialDigits(low1, high1));
        System.out.println();

        // Test case 2
        int low2 = 1000;
        int high2 = 13000;
        System.out.println("Test case 2:");
        System.out.println("Input: low = 1000, high = 13000");
        System.out.println("Expected output: [1234, 2345, 3456, 4567, 5678, 6789, 12345]");
        System.out.println("Actual output: " + sequentialDigits(low2, high2));
        System.out.println();

        // Test case 3
        int low3 = 10;
        int high3 = 1000000000;
        System.out.println("Test case 3:");
        System.out.println("Input: low = 10, high = 1000000000");
        System.out.println("Expected output: [12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789]");
        System.out.println("Actual output: " + sequentialDigits(low3, high3));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; i + j <= 9; j++) {
                String tmp = str.substring(j, i + j);
                Integer value = Integer.valueOf(tmp);
                if (value >= low && value <= high) {
                    list.add(value);
                }
            }
        }
        return list;
    }
}
