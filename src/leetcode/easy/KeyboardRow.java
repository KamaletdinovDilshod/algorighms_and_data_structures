package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeyboardRow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
    public static String[] findWords(String[] words) {
        Set<Character> r3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        Set<Character> r1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> r2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        boolean check;
        StringBuilder res = new StringBuilder();
        String cur;
        for (String str : words) {
            cur = str.toLowerCase();
            check = isValid(cur, r1) || isValid(cur, r2) || isValid(cur, r3);
            if (check) {
                res.append(str);
                res.append(" ");
            }
        }
        if (res.length() == 0) {
            return new String[0];
        } else {
            return res.toString().split(" ");
        }
    }
private static boolean isValid(String s, Set<Character> set){
    for (char ch : s.toCharArray())
        if (!set.contains(ch)) return false;
    return true;
    }
}
