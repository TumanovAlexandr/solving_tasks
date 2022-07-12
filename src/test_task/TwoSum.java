package test_task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        // Given an array of integers nums and an integer target, return indices of the two numbers such that they
        // add up to target.
        // You may assume that each input would have exactly one solution, and you may not use the same element twice.
        // You can return the answer in any order.

        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        // check input
        if (nums == null) return new int[0];

        int[] temp = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return temp;
    }

    public static int[] twoSum2(int[] nums, int target) {

        // check input
        if (nums == null) return new int[0];

        Map<Integer, Integer> table = new HashMap<>();

        int[] temp = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (table.get(target - nums[i]) != null) {
                temp[0] = table.get(target - nums[i]);
                temp[1] = i;
                return temp;
            } else {
                table.put(nums[i], i);
            }
        }

        return temp;
    }
}
