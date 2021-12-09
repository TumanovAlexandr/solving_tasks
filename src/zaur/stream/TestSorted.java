package zaur.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(34);
        list.add(78);

        List<Integer> collect = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("------------------");

        Integer result = list
                .stream()
                .filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e).get();

        System.out.println(result);
    }
}
