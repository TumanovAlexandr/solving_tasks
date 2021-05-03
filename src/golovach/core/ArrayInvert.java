package golovach.core;

import java.util.Arrays;

public class ArrayInvert {

    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6};

        invertRec(data, 0);

        System.out.println(Arrays.toString(data));
    }

    public static void invert(int[] data) {
        for (int i = 0; i < data.length / 2; i++) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
    }

    public static void invertRec(int[] data, int i) {
        if (i < data.length / 2) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
            invertRec(data, i + 1);
        }
    }

}
