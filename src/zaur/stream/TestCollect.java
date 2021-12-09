package zaur.stream;

import zaur.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollect {
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

        Map<Integer, List<Student>> collect = students
                .stream()
                .map(e -> {
                    e.setName(e.getName().toUpperCase(Locale.ROOT));
                    return e;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        collect.forEach((k, v) -> System.out.println(k + " : " + v.toString()));

        System.out.println("--------------");

        Map<Boolean, List<Student>> collect1 = students
                .stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        collect1.forEach((k, v) -> System.out.println(k + " : " + v.toString()));
    }
}
