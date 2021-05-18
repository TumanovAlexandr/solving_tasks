package test_task;

import java.util.ArrayList;

// Поиск повторяющихся элементов в массиве java

public class App00 {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,5,6,7,8,9,10};
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {
            array.add(intArray[i]);
        }

        for(int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if(array.get(i) == array.get(j)) {
                    System.out.println(array.get(i));
                }
            }
        }

    }
}
