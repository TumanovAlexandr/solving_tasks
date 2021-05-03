package golovach.core;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {3, 5, 6, 8, 2, 4, 9, 1, 0, 7};

        System.out.println(Arrays.toString(data));

        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = barrier + 1; index < data.length; index++) {
                swap(data, barrier, index);
            }
        }

        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] data, int first, int second) {
        if (data[first] > data[second]) {
            int tmp = data[first];
            data[first] = data[second];
            data[second] = tmp;
        }
    }
}
