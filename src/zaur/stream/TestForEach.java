package zaur.stream;

import zaur.lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {
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

        students.stream().forEach(Util::myMethod);
    }
}

class Util {
    public static void myMethod(Student student) {
        int a = student.getAge();
         a += 5;
        System.out.println(a);
    }
}
