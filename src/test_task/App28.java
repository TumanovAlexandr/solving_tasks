package test_task;

public class App28 {
    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private static final String[] TEN = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static final String[] THOUSAND = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) {
        App28 app = new App28();
        System.out.println(app.numberToWords(123));
        System.out.println(app.numberToWords(12345));
        System.out.println(app.numberToWords(1234567));
        System.out.println(app.numberToWords(1234567891));
    }

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        int i = 0;
        String words = "";

        while (num != 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSAND[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    } // TC: O(n) SC:O(n)

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_20[num] + " ";
        } else if (num < 100) {
            return TEN[num / 10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }
}
