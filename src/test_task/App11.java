package test_task;

public class App11 {


    public static void main(String[] args) {
        System.out.println(isPalindrome("казак"));
    }

    static boolean isPalindrome(String str) {
        // your code here
        if(str == null) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }

}
