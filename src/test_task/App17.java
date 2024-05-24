package test_task;

import java.util.HashSet;
import java.util.Set;

public class App17 {
    public static int longestConsecutiveSequence(int[] nums) {
        // Convert the input array to a set for faster lookup
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Initialize the variable to store the length of the longest consecutive sequence
        int maxLength = 0;

        // Iterate through each element in the input array
        for (int num : nums) {
            // Check if the current element is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Continue checking consecutive elements in increasing order
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Update the maximum length if needed
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutiveSequence(nums);
        System.out.println(result);
    }
}
