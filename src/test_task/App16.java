package test_task;

import java.util.HashMap;

public class App16 {

    public static int[] subarraySum(int[] nums, int target) {
        int[] result = new int[2];

        // Create a hash table to store <sum, index> tuples
        HashMap<Integer, Integer> map = new HashMap<>();

        // Insert (0, -1) tuple into the hash table to handle the case when
        // subarray with target sum starts from index 0
        map.put(0, -1);

        int sum = 0;

        // Traverse the input array
        for (int i = 0; i < nums.length; i++) {
            // Accumulate sum
            sum += nums[i];

            // If (sum - target) is already present in hash table, we have found a subarray with target sum
            if (map.containsKey(sum - target)) {
                result[0] = map.get(sum - target) + 1;
                result[1] = i;
                return result;
            }

            // Insert (sum, index) tuple into the hash table
            map.put(sum, i);
        }

        // Return empty list if no subarray with target sum exists
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = subarraySum(nums, target);

        // Print the result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
