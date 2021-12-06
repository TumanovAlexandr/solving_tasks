package zaur.lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("buy");
        list.removeIf(s -> s.length() < 5);
        System.out.println(list);
    }
}
