package test_task;

import java.util.HashMap;

public class App26 {

    public static void main(String[] args) {
        App26 app = new App26();
        System.out.println(app.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(app.lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(app.lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(app.lengthOfLongestSubstring("")); // 0
    }

    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                map.put(ch, right);
            } else {
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}
