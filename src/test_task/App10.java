package test_task;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App10 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());

    }

    private void bracket(int count, String s, int left, int rigth)  {
        if (left == count && rigth == count) {
            System.out.println(s);
        } else {
            if (left < count) {
                
            }
        }
    }
}
