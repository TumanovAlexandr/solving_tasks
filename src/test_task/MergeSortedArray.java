package test_task;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {4, 6, 30};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

    public static int[] mergeSortedArrays(int[] first, int[] second) {

        // check arrays
        if (first == null) return second;
        if (second == null) return first;

        int length = first.length + second.length;

        int[] mergeArray = new int[length];
        int j = 0, k = 0;

        for (int i = 0; i < mergeArray.length; i++) {
            if (j != first.length && (k == second.length || first[j] < second[k])) {
                mergeArray[i] = first[j];
                j++;
            } else {
                mergeArray[i] = second[k];
                k++;
            }
        }

        return mergeArray;

    }
}
