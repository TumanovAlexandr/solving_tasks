package zaur.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Ivan");
        list.add("Anton");
        list.add("Sveta");
        list.add("Elena");

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
//        list1.add(100);

        List<String> list2 = List.copyOf(list);
        System.out.println(list2);
    }
}
