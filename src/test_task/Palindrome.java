package test_task;

public class Palindrome {
    /**
     * Напишите программу, которая проверяет, является ли введённая строка палиндромом.
     * Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются
     * по буквам или по словам как слева направо, так и справа налево.
     * Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("а роза упала на лапу Азора"));
        System.out.println(isPalindrome("202"));
        System.out.println(isPalindrome("fafaf"));
        System.out.println(isPalindrome("example")); // не полиндром
    }

    static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        str = str.toLowerCase().replaceAll("[^a-zа-я0-9]", "");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
