package leetcode.easy;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch2 : t.toCharArray()) {
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }
        for (Integer values : map.values()) {
            if (values != 0) return false;
        }
        return true;
    }
}
