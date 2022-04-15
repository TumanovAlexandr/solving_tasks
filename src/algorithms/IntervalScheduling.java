package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalScheduling {
    public static void main(String[] args) {
        int[][] intervals = {
                {0,3},
                {0,15},
                {5,10},
                {7,12},
                {11,16},
                {12,14},
                {16,20},
        };

        List<int[]> optimalSchedule = schedule(intervals);

        for (int[] is : optimalSchedule) {
            for (int i = 0; i < is.length; i++) {
                System.out.print(is[i] + " ");
            }
            System.out.println();
        }
    }

    private static List<int[]> schedule(int[][] intervals) {

        ArrayList<int[]> optimalIntervalSet = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);

        int lastFinishTime = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            int start = interval[0];
            if (start > lastFinishTime) {
                int end = interval[1];

                optimalIntervalSet.add(interval);

                lastFinishTime = end;
            }
        }

        return optimalIntervalSet;
    }
}
