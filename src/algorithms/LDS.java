package algorithms;

import java.util.Arrays;

public class LDS {
    public static void main(String[] args) {
        int[] nums = { 20, 8, 12, 16, 10, 9, 18, 7 };

        System.out.println(getLds(nums, 0, Integer.MAX_VALUE));

        int[][] dp = new int[nums.length + 1][nums.length];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println("Top down: " + getLds(nums, -1, 0, dp));

        System.out.println("Bottom up: " + getLds(nums));
    }

    private static int getLds(int[] nums) {

        if (nums.length == 0)
            return 0;

        int[] maxLds = new int[nums.length];
        Arrays.fill(maxLds, 1);

        int maxSoFar = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j])
                    maxLds[i] = Math.max(maxLds[i], maxLds[j] + 1);
            }
            maxSoFar = Math.max(maxSoFar, maxLds[i]);
        }

        return maxSoFar;
    }

    private static int getLds(int[] nums, int prevIndex, int curr, int[][] dp) {

        if (curr == nums.length)
            return 0;

        if (dp[prevIndex + 1][curr] > 0)
            return dp[prevIndex + 1][curr];

        int incl = 0;
        if (prevIndex < 0 || nums[curr] < nums[prevIndex]) {
            incl = 1 + getLds(nums, curr, curr + 1, dp);
        }

        int excl = getLds(nums, prevIndex, curr + 1, dp);

        dp[prevIndex + 1][curr] = Integer.max(incl, excl);

        return dp[prevIndex + 1][curr];
    }

    private static int getLds(int[] nums, int i, int prev) {

        if (i == nums.length)
            return 0;

        int incl = 0;
        if (nums[i] < prev)
            incl = 1 + getLds(nums, i + 1, nums[i]);

        int excl = getLds(nums, i + 1, prev);

        return Integer.max(incl, excl);
    }
}
