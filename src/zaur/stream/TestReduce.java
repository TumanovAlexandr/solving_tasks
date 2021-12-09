package zaur.stream;

import java.util.ArrayList;
import java.util.List;

public class TestReduce {
    public static void main(String[] args) {

        List<Integer> students = new ArrayList<>();
        students.add(5);
        students.add(8);
        students.add(2);
        students.add(4);
        students.add(3);

        Integer result = students
                .stream()
                .reduce((accumulator, element) -> accumulator * element).get();

        System.out.println(result);

        Integer result2 = students
                .stream()
                .reduce(2, (accumulator, element) -> accumulator * element);

        System.out.println(result2);

        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("How are you?");
        list.add("I am fine");
        list.add("Bye");

        String s = list
                .stream()
                .reduce((a, e) -> a + " " + e).get();

        System.out.println(s);

//        List<Integer> students100 = new ArrayList<>();
//        Optional<Integer> x = students100
//                .stream()
//                .reduce((accumulator, element) -> accumulator * element);
//
//        if (x.isPresent()) {
//            System.out.println(x.get());
//        } else {
//            System.out.println("not present");
//        }
    }
}
