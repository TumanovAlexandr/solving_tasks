package golovach;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {3, 5, 6, 8, 2, 4, 9, 1, 0, 7};

        System.out.println(Arrays.toString(data));

        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                swap(data, j, j + 1);
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
