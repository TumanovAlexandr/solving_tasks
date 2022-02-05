package test_task;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("stop")) {
                break;
            }

            switch (text) {
                case "Mos":
                case "Vla":
                case "Ros":
                    System.out.println("Rus");
                    break;
                case "Rim":
                case "Mil":
                case "Tyr":
                    System.out.println("Ital");
                    break;
                default:
                    System.out.println("No");
                    break;
            }

        }
    }
}
