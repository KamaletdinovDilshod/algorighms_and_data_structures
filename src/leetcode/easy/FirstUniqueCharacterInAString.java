package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "aabb";
        String s2 = "loveleetcode";
        System.out.println(firstUniqueChar(s));
        System.out.println(firstUniqueChar(s2));
    }

    public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int j = s.length() - 1; j >= 0; j--) {
            if (hm.get(s.charAt(j)) == 1) {
                stack.push(s.charAt(j));
            }
        }
        if (stack.isEmpty()) return -1;
        return s.indexOf(stack.peek());

        // Second Approach
//        HashMap<Character, Integer> count = new HashMap<>();
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//        for (int i = 0; i < n; i++) {
//            if (count.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//        return -1;
    }
}
