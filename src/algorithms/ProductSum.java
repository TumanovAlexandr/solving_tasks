package algorithms;

import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        List<Object> a1 = Arrays.asList(3, 2);
        List<Object> a2 = Arrays.asList(2, 4);
        List<Object> a3 = Arrays.asList(a2, 1);
        List<Object> arr = Arrays.asList(1, 2, a1, 6, a3, 7);

        System.out.println(productSum(arr, 1));
    }

    private static int productSum(List<Object> list, int depth) {
        int sum = 0;

        for (Object obj : list) {
            if (obj instanceof List) {
                sum += productSum((List<Object>) obj, depth + 1);
            } else {
                sum += (int) obj;
            }
        }
        return sum * depth;
    }
}
