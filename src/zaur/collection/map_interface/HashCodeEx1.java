package zaur.collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Alex", "Tumanov", 3);
        Student student2 = new Student("Anton", "Tumanov", 1);
        Student student3 = new Student("Sveta", "Ivanova", 4);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.5);
        System.out.println(map);
        Student student4 = new Student("Alex", "Tumanov", 3);
        boolean result = map.containsKey(student4);
        System.out.println(result);
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
