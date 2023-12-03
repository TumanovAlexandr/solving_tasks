package basepatterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Plus(new Number(2), new Plus(new Number(3), new Number(4)));
        int result = expression.interpret();
        System.out.println(result); // Output: 9
    }
}
