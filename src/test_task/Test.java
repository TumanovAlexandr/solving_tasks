package test_task;

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        System.out.println(reverse3("123456"));

        ArrayList<Object> objects = new ArrayList<>(10);
    }

    public static String reverse(String str) {

        String temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }

    public static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse3(String str) {

        if (str.length() == 0) return "";

        return reverse3(str.substring(1)) + str.charAt(0);
    }
}
