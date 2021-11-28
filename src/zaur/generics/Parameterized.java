package zaur.generics;

public class Parameterized {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("Hi");
//        System.out.println(info);
//        String s = info.getValue();

//        Info<Integer> info1 = new Info<>(18);
//        System.out.println(info1);
//        Integer s1 = info1.getValue();
    }
}

class Info <T extends Number&I1&I2> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}
