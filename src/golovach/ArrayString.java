package golovach;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String data = "Hello";
        System.out.println(invert(data));
    }

    private static String invert(String arg) {

        char[] data = arg.toCharArray();

        for (int i = 0; i < data.length / 2; i++) {
            char tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }

        return new String(data);
    }


}
