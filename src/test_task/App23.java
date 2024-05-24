package test_task;

import java.util.stream.Stream;

public class App23 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("а роза упала на лапу Азора"));
        System.out.println(isPalindrome("202"));
        System.out.println(isPalindrome("fafaf"));
        System.out.println(isPalindrome("example")); // Not a palindrome
    }

    static boolean isPalindrome(String str) {
        if(str==null) {
            return false;
        }


        return Stream.of(str.toLowerCase())
                .anyMatch(e -> e.equals(new StringBuilder(str.toLowerCase()).reverse().toString()));
    }
}
