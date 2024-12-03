package test_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App38 {

    public static void main(String[] args) {
        App38 app = new App38();
        List<String> result = app.allPossibleString("abc");
        for (String s : result) {
            System.out.println(s);
        }
    }

    private List<String> allPossibleString(String s) {
        int n = s.length();
        List<String> powerset = new ArrayList<>();
        int max = (1 << n) - 1;
        for (int i = 0; i <= max; i++) {
            String str = "";
            for (int bit = 0; bit < n; bit++) {
                if ((i & (1 << bit)) != 0) {
                    str = s.charAt(n - 1 - bit) + str;
                }
            }
            powerset.add(str);
        }
        Collections.sort(powerset);
        return powerset;
    }
}
