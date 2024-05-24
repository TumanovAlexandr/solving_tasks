package test_task;

public class App24 {

    public static void main(String[] args) {
        App24 app = new App24();
        System.out.println(app.isPalindrome(121)); // true
        System.out.println(app.isPalindrome(-121)); // false
        System.out.println(app.isPalindrome(10)); // false
        System.out.println(app.isPalindrome(0)); // true
    }

    public boolean isPalindrome(int x) {
        // x is not less than 0
        if (x < 0) return false;
        // x is not equal 0 and x end with 0
        if (x != 0 && x % 10 == 0) return false;

        int revers = 0;

        while (x > revers) {
            int lastDigit = x % 10;
            revers = revers * 10 + lastDigit;
            x = x / 10;
        }

        return (x == revers) || (x == revers / 10);
    }
}
