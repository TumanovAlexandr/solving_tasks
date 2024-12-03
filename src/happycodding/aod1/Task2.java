package happycodding.aod1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        Map<Integer, Integer> secondCount = new HashMap<>();
        long res = 0;
        Scanner scanner = new Scanner(Objects.requireNonNull(Task1.class.getResourceAsStream("text1.txt")));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] num = line.split("   ");
            int first = Integer.parseInt(num[0]);
            firstList.add(first);
            int second = Integer.parseInt(num[1]);
            secondCount.put(second, secondCount.getOrDefault(second, 0) + 1);
        }

        for (int first : firstList) {
            res += (long) secondCount.getOrDefault(first, 0) * first;
        }

        System.out.println(res);
    }
}
