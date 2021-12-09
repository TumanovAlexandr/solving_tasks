package zaur.stream;

import zaur.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMinMax {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 22, 3, 8.3);
        Student st2 = new Student("Kolya", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 5, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student studentMin = students
                .stream()
                .min((x, y) -> x.getAge() - y.getAge()).get();

        System.out.println(studentMin);

        System.out.println("---------");

        Student studentMax = students
                .stream()
                .max((x, y) -> x.getAge() - y.getAge()).get();

        System.out.println(studentMax);
        System.out.println("---------");

        students
                .stream()
                .filter(e -> e.getAge() > 20)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("---------");

        students
                .stream()
                .filter(e -> e.getAge() > 20)
                .skip(2)
                .forEach(System.out::println);
        System.out.println("---------");

        List<Integer> collect = students
                .stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("---------");

        int sum = students
                .stream()
                .mapToInt(el -> el.getCourse())
                .sum();

        System.out.println(sum);

        System.out.println("---------");

        double average = students
                .stream()
                .mapToInt(el -> el.getCourse())
                .average()
                .getAsDouble();

        System.out.println(average);

        System.out.println("---------");

        int min = students
                .stream()
                .mapToInt(el -> el.getCourse())
                .min()
                .getAsInt();

        System.out.println(min);

        System.out.println("---------");

        int max = students
                .stream()
                .mapToInt(el -> el.getCourse())
                .max()
                .getAsInt();

        System.out.println(max);
    }
}
