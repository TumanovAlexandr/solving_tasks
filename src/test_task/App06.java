package test_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App06 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String J = r.readLine();
        String S = r.readLine();

        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
