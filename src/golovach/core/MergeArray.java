package golovach.core;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[] a = {0, 1, 2};
        int[] b = {3, 5};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] result = new int[a.length + b.length];

        int aIndex = 0;
        int bIndex = 0;

        while (aIndex + bIndex != result.length) {
            if (aIndex < bIndex) {
                result[aIndex + bIndex] = a[aIndex++];
            } else {
                result[aIndex + bIndex] = b[bIndex++];
            }
            if (aIndex == a.length) {

            }
        }

        System.out.println(Arrays.toString(result));
    }
}
