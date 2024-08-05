package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<String, Character> mapping = new HashMap<>();
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;
        int i = 0;
        for (String str : arr) {
            if (!mapping.containsKey(str)) {
                if (mapping.containsValue(pattern.charAt(i))) return false;
                mapping.put(str, pattern.charAt(i++));
            } else {
                if (mapping.get(str) != pattern.charAt(i++)) return false;
            }
        }
        return true;
    }
}
