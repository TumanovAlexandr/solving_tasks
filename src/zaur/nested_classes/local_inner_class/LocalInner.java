package zaur.nested_classes.local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class A {
            private int a;

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }

            @Override
            public String toString() {
                return "A{" +
                        "a=" + a +
                        '}';
            }
        }

        A a = new A();
        a.setA(12);
        System.out.println(a);

    }
}
