package zaur.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(100, "Alex", "Tumanov", 12345);
        Employee employee2 = new Employee(15, "Anton", "Sidorov", 6543);
        Employee employee3 = new Employee(123, "Alex", "Sidorov", 8542);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        /*if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }*/
//        return this.id - o.id;
//        return this.id.compareTo(o.id);
        int res = this.name.compareTo(o.name);
        if (res == 0) {
            res = this.surname.compareTo(o.surname);
        }
        return res;
    }
}
