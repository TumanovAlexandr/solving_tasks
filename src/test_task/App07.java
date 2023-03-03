package test_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App07 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int maxCountRepeat = 0;
        int countRepeat = 0;

        int n = Integer.parseInt(r.readLine());
        int currentCount = 0;
        while (currentCount < n) {
            String line = r.readLine();
            currentCount++;
            if (line.equals("1")) {
                countRepeat++;
            } else {
                countRepeat = 0;
            }

            if (countRepeat > maxCountRepeat) {
                maxCountRepeat = countRepeat;
            }
        }

        System.out.println(maxCountRepeat);
    }
}
