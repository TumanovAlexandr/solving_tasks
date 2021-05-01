package golovach;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = {3, 5, 6, 8, 2, 4, 9, 1, 0, 7};

        System.out.println(Arrays.toString(data));

        for (int barrier = 1; barrier < data.length; barrier++) {

            int newElement = data[barrier];
            int location = barrier - 1;

            while (location >= 0 && data[location] > newElement) {
                data[location + 1] = data[location];
                location--;
            }
            data[location + 1] = newElement;
        }

        System.out.println(Arrays.toString(data));
    }

}
