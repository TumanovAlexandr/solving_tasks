package zaur.stream;

import zaur.lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudentsToFaculty(Student student) {
        this.students.add(student);
    }
}
