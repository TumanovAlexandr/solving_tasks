package zaur.stream;

import zaur.lambda.Student;

import java.util.ArrayList;

public class TestFlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 22, 3, 8.3);
        Student st2 = new Student("Kolya", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 5, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentsToFaculty(st1);
        f1.addStudentsToFaculty(st2);
        f1.addStudentsToFaculty(st3);
        f2.addStudentsToFaculty(st4);
        f2.addStudentsToFaculty(st5);

        ArrayList<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties
                .stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}
