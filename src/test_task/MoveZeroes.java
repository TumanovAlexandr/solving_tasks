package test_task;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        // Given an integer array nums, move all 0's to the end of
        // it while maintaining the relative order of the non-zero elements.
        // Note that you must do this in-place without making a copy of the array.

        // Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]

        int[] arr = {0,1,0,3,12};

        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    static int[] moveZeroes(int[] arr) {

        int size = arr.length;
        boolean done = false;

        while (!done) {
            done = true;
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] != 0) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 0;
                    done = false;
                }
            }
        }

        return arr;
    }
}
