package zaur.stream;

import zaur.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class TestFilter {
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

        List<Student> collect = students
                .stream()
                .filter(e -> e.getAge() > 22 && e.getAvgGrade() < 7.2)
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("-----------------");

        List<Student> studentsSorted = students
                .stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());

        System.out.println(studentsSorted);
        System.out.println("-----------------");

        students
                .stream()
                .map( e -> {
                    e.setName(e.getName().toUpperCase(Locale.ROOT));
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(e -> System.out.println(e ));

        System.out.println("-----------------");

        Student student = students
                .stream()
                .map(e -> {
                    e.setName(e.getName().toUpperCase(Locale.ROOT));
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();

        System.out.println(student);
    }
}
