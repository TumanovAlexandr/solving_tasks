package zaur.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("hi"));
    }

    public static void main(String[] args) {
        def(str -> {return str.length();});
    }
}

interface I {
    int abc(String s);
}
