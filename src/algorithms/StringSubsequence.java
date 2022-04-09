package algorithms;

public class StringSubsequence {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(getSubsequence("abc"));
    }

    private static String getSubsequence(String word) {

        if (word.isEmpty())
            return "";

        char first = word.charAt(0);
        String rest = getSubsequence(word.substring(1));

        String result = "";

        for (String subseq : rest.split(",", -1)) {
            result += "," + first + subseq;
            result += "," + subseq;
        }

        return result.substring(1);
    }

    private static int factorial(int n) {
        if (n == 0) return 1;

        return n * factorial(n - 1);
    }
}
