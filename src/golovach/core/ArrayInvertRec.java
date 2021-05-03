package golovach.core;

import java.util.Arrays;

public class ArrayInvertRec {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};

        invertRec(data, 0);

        System.out.println(Arrays.toString(data));
    }

    private static void invertRec(int[] data, int i) {
        if (i < data.length / 2) {
            swap(data, i, data.length - 1 - i);
            invertRec(data, i + 1);
        }
    }

    private static void swap(int[] data, int first, int second) {
        int tmp = data[first];
        data[first] = data[second];
        data[second] = tmp;
    }

}
