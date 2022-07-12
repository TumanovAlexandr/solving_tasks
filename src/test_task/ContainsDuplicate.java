package test_task;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        // Given an integer array nums, return true if any value appears at least
        // twice in the array, and return false if every element is distinct.

        // Input: nums = [1,2,3,1]
        // Output: true

        int[] arr = {2,5,1,2,3,5,1,2,4};

        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }
}
