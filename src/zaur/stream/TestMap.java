package zaur.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("How are you?");
        list.add("I am fine");
        list.add("Bye");

        List<Integer> collect = list.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(collect);
    }
}
