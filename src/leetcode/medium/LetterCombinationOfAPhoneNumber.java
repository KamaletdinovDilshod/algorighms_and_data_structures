package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "222";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> nl = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        nl.put('2', "abc");
        nl.put('3', "def");
        nl.put('4', "ghi");
        nl.put('5', "jkl");
        nl.put('6', "mno");
        nl.put('7', "pqrs");
        nl.put('8', "tuv");
        nl.put('9', "wxyz");
        if (digits.length() == 0) return ans;
        rec(digits, 0, nl, sb, ans);
        return ans;
    }

    private static void rec(String digits, int i, HashMap<Character, String> nl, StringBuilder sb, List<String> ans) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String cur = nl.get(digits.charAt(i));
        System.out.println(i +  " " );
        for (int k = 0; k < cur.length(); k++) {
            sb.append(cur.charAt(k));
            rec(digits, i+1, nl, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

