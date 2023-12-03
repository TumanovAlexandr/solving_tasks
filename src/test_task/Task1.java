package test_task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */
    public static void main(String[] args) {
        int[] ar = {3, 4, 2, 7};

        if(searchValues(ar, 10).length != 0){
            System.out.println(Arrays.toString(searchValues(ar, 10)));
        } else System.out.println("В массиве нет пары, которые дают задданую сумму");
    }
    public static int[] searchValues(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i && (arr[i] + arr[j]) == sum) {
                    return new int[]{arr[i], sum - arr[i]};
                }
            }
        }
        return new int[0];
    }

    public static int[] getValues(int[] array, int sum) {
        int[] ints = new int[0];

        if (array == null) {
            return ints;
        }

        Set<Integer> numberSet = new HashSet<>();

        for (int element : array) {
            int pair = sum - element;
            if (numberSet.contains(pair)) {
                return new int[]{pair, element};
            }
            numberSet.add(element);
        }

        return ints;
    }

    public static boolean fuzzySearch(String search, String text) {
        if (search == null || text == null || search.length() > text.length()) {
            return false;
        }

        char[] searchChars = search.toCharArray();
        char[] textChars = text.toCharArray();
        char[] result = new char[searchChars.length];

        int j = 0;
        for (int i = 0; i < searchChars.length; i++) {
            while (j < textChars.length) {
                if (searchChars[i] == textChars[j]) {
                    result[i] = searchChars[i];
                    j = j + 1;
                    break;
                }
                j++;
            }
        }

        return Arrays.equals(searchChars, result);
    }
}
