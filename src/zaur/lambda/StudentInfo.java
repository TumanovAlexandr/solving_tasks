package zaur.lambda;

import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(List<Student> al, Predicate<Student> sc) {
        for (Student s : al
             ) {
            if (sc.test(s)) {
                System.out.println(s);
            }
        }
    }
}
