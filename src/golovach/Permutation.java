package golovach;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};

        permute(data, data.length);
    }

    private static void permute(int[] data, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(data));
        } else {
            for (int i = 0; i < size; i++) {
                swap(data, i,size - 1);
                permute(data, size - 1);
            }
        }
    }

    private static void swap(int[] data, int first, int second) {
        int tmp = data[first];
        data[first] = data[second];
        data[second] = tmp;
    }


}
