package test_task;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        // Given an array, rotate the array to the right by k steps, where k is non-negative.

        // Input: nums = [1,2,3,4,5,6,7], k = 3
        // Output: [5,6,7,1,2,3,4]
        // Explanation:
        // rotate 1 steps to the right: [7,1,2,3,4,5,6]
        // rotate 2 steps to the right: [6,7,1,2,3,4,5]
        // rotate 3 steps to the right: [5,6,7,1,2,3,4]

        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
    }

    static void rotate(int[] arr, int k) {

        int i = 0;
        int size = arr.length;

        while (k > 0) {
            int temp = arr[size - 1];

            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[i] = temp;
            k--;
            System.out.println(Arrays.toString(arr));
        }

    }
}
