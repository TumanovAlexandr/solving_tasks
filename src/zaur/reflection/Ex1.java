package zaur.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("zaur.reflection.Employee");
        /*Class employeeClass2 = Employee.class;
        Employee employee = new Employee();
        Class employeeClass3 = employee.getClass();*/

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("----------");
        Field[] fields = employeeClass.getFields();

        for (Field field : fields
             ) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("----------");
        Field[] declaredFields = employeeClass.getDeclaredFields();

        for (Field field : declaredFields
        ) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("----------");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return " + someMethod1.getReturnType());
    }
}
