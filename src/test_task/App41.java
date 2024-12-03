package test_task;

import java.util.ArrayList;
import java.util.List;

public class App41 {

    public static void main(String[] args) {
        int n = 5;
        int[] ranges = {3, 4, 1, 1, 0, 0};
        System.out.println(minTaps(n, ranges));
    }


    public static int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];

        for (int i = 0; i < ranges.length; i++) {
            int start = Math.max(0, i - ranges[i]);
            int end = Math.min(n, i + ranges[i]);

            maxReach[start] = Math.max(maxReach[start], end);
        }

        int taps = 0;
        int currEnd = 0;
        int nextEnd = 0;

        for (int i = 0; i <= n; i++) {
            if (i > nextEnd) {
                return -1;
            }
            if (i > currEnd) {
                taps++;
                currEnd = nextEnd;
            }
            nextEnd = Math.max(nextEnd, maxReach[i]);
        }

        return taps;
    }
}
