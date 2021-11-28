package zaur.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.24);
        showListInfo(list1);
        System.out.println(summ(list1));
    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    static double summ(List<? extends Number> list) {
        double summ = 0;
        for (Number n : list
             ) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
