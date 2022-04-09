package algorithms;

import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        List<Object> a1 = List.of(3, 2);
        List<Object> a2 = List.of(2, 4);
        List<Object> a3 = List.of(a2, 1);
        List<Object> arr = List.of(1, 2, a1, 6, a3, 7);

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
