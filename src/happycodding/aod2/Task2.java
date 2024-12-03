package happycodding.aod2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int res = 0;
        Scanner scanner = new Scanner(Objects.requireNonNull(Task2.class.getResourceAsStream("text1.txt")));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] num = line.split(" ");
            List<Integer> list = new ArrayList<>();
            for (String s : num) {
                Integer i = Integer.parseInt(s);
                list.add(i);
            }
            if (isSafe(list) || canBeSafeByRemovingOne(list)) {
                res += 1;
            }
        }
        System.out.println(res);
    }

    private static boolean isSafe(List<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1) || list.get(i) - list.get(i - 1) > 3) {
                inc = false;
                break;
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) >= list.get(i - 1) || list.get(i - 1) - list.get(i) > 3) {
                dec = false;
                break;
            }
        }
        return inc || dec;
    }

    private static boolean canBeSafeByRemovingOne(List<Integer> list) {
        if (list.size() < 3) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            List<Integer> newList = new ArrayList<>(list);
            newList.remove(i);
            if (isSafe(newList)) {
                return true;
            }
        }
        return false;
    }
}
