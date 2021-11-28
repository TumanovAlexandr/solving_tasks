package zaur.generics;

import java.util.Arrays;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 20, 5);
        int a = GetMethod.getSecondElement(list);
        System.out.println(a);
    }
}

class GetMethod{
    public static <T> T getSecondElement(List<T> all) {
        return all.get(1);
    }
}