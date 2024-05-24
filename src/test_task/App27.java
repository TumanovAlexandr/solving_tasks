package test_task;

public class App27 {

public static void main(String[] args) {
        App27 app = new App27();
        System.out.println(app.reverseWords("the sky is blue")); // "blue is sky the"
        System.out.println(app.reverseWords("  hello world  ")); // "world hello"
        System.out.println(app.reverseWords("a good   example")); // "example good a"
    }

    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        // 1. reverse the entire string
        reverse(str, 0, str.length - 1);
        // 2. revers each words
        reverseWords(str);
        // 3. clean spaces
        return cleanSpaces(str);
    }

    private String cleanSpaces(char[] str) {
        int left = 0;
        int right = 0;
        while (right < str.length) {
            while (right < str.length && str[right] == ' ') right++;
            while (right < str.length && str[right] != ' ') {
                str[left] = str[right];
                left++;
                right++;
            }
            while (right < str.length && str[right] == ' ') right++;
            if (right < str.length) {
                str[left] = ' ';
                left++;
            }
        }
        return new String(str).substring(0, left);
    }

    private void reverseWords(char[] str) {
        int left = 0;
        int right = 0;
        while (left < str.length) {
            while (left < str.length && str[left] == ' ') left++;
            right = left;
            while (right < str.length && str[right] != ' ') right++;
            reverse(str, left, right - 1);
            left = right;
        }
    }

    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}
