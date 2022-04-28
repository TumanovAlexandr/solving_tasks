package algorithms;

import java.util.Arrays;

public class Staircase {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;

        int[] arr = new int[n + 1];

        Arrays.fill(arr, -1);

        // Top-Down
        int ways = noOfWay(n, k, arr);

        System.out.println(ways);

        // Bottom-Up
        int noOfWay = waysBottomUp(n, k);

        System.out.println(noOfWay);
    }

    private static int waysBottomUp(int n, int k) {
        int[] arr = new int[n + 1];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            arr[i] = 0;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0)
                    arr[i] += arr[i - j];
            }

        }

        return arr[n];
    }

    private static int noOfWay(int n, int k, int[] arr) {

        if (n == 0) {
            arr[n] = 1;
            return 1;
        }

        if (n < 0) return 0;

        if (arr[n] != -1) return arr[n];

        arr[n] = 0;

        for (int i = 1; i <= k; i++) {
            arr[n] = arr[n] + noOfWay(n - i, k, arr);
        }

        return arr[n];
    }
}
