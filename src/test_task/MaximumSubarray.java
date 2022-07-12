package test_task;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        // Given an integer array nums, find the contiguous subarray
        // (containing at least one number) which has the largest sum and return its sum.

        // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        // Output: 6
        // Explanation: [4,-1,2,1] has the largest sum = 6.

        int[] arr = {5,4,-1,7,8};

        System.out.println(maxSub(arr));

        System.out.println(maxSubArraySum(arr));
    }

    public static int maxSub(int[] arr) {

        if (arr == null) return 0;

        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    static int maxSubArraySum(int a[]) {

        int currentMax = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            currentMax = Math.max(a[i], currentMax + a[i]);
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }

}
