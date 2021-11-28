package zaur.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("dwcevwv"));
//        list.add(new Car());
        list.add("Hi");
        list.add("Byu");
        list.add("ok");
//        list.add(new Car());

        for (Object o : list
             ) {
            System.out.println(o + " length" + ((String)o).length());
        }
    }
}

class Car{}
