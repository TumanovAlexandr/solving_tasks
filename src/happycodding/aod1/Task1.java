package happycodding.aod1;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Queue<Integer> firstList = new PriorityQueue<>();
        Queue<Integer> secondList = new PriorityQueue<>();
        int sum = 0;
        Scanner scanner = new Scanner(Objects.requireNonNull(Task1.class.getResourceAsStream("text.txt")));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] num = line.split("   ");
            int first = Integer.parseInt(num[0]);
            firstList.add(first);
            int second = Integer.parseInt(num[1]);
            secondList.add(second);
        }

        while (!firstList.isEmpty() && !secondList.isEmpty()) {
            Integer firrst = firstList.poll();
            Integer second = secondList.poll();
            sum += Math.abs(firrst - second);
        }
        System.out.println(sum);
    }
}
