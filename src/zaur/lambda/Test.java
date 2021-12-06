package zaur.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//interface StudentChecks {
//    boolean check(Student s);
//}

public class Test {
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

        System.out.println(avgOfSmt(students, student -> student.getAvgGrade()));

//        StudentInfo studentInfo = new StudentInfo();
//        System.out.println(students);
//        Predicate<Student> p1 = s -> s.getAvgGrade() > 7.5;
//        Predicate<Student> p2 = s -> s.getSex() == 'f';
//
//        studentInfo.testStudents(students, p1.and(p2));
//
//        studentInfo.testStudents(students, s -> s.getAge() < 30);
//        System.out.println("------------------");
//        studentInfo.testStudents(students, s -> s.getAvgGrade() > 8);
//        System.out.println("------------------");
//        studentInfo.testStudents(students, s -> s.getAge() > 20 && s.getAvgGrade() < 9.3 && s.getSex() == 'f');

    }

    private static double avgOfSmt(List<Student> list, Function<Student, Double> function) {
        double result = 0;

        for (Student student : list
             ) {
            result += function.apply(student);
        }

        result = result / list.size();

        return result;
    }
}

