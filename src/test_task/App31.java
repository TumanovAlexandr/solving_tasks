package test_task;

import java.util.HashMap;
import java.util.Map;

public class App31 {
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Test case 1:");
        System.out.println("Input: [15, -2, 2, -8, 1, 7, 10, 23]");
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + maxLen(arr1, arr1.length));
        System.out.println();

        // Test case 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Test case 2:");
        System.out.println("Input: [1, 2, 3, 4, 5, 6, 7, 8]");
        System.out.println("Expected output: 0");
        System.out.println("Actual output: " + maxLen(arr2, arr2.length));
        System.out.println();
    }

    public static int maxLen(int[] arr, int n) {
        int sum = 0;
        int len = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                len = i + 1;
            } else if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return len;
    }
} // TC: O(n), SC: O(n)
