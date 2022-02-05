package zaur.reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Summ = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction = " + result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication = " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Division = " + result);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))) {
            String methodName = reader.readLine();
            String s1 = reader.readLine();
            String s2 = reader.readLine();

            Calculator calculator = new Calculator();
            Class<? extends Calculator> c1 = calculator.getClass();

            Method method = null;

            Method[] methods = c1.getDeclaredMethods();

            for (Method myMethod : methods
                 ) {
                if (myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(s1), Integer.parseInt(s2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}