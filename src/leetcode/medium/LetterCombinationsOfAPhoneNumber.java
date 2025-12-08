package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    static String[] phoneCharacters = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;

        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");

        StringBuilder currentCombination = new StringBuilder();
        backtrack(digits, 0, mapping, currentCombination, result);

        return result;
    }

    public static void backtrack(
            String digits,
            int index,
            Map<Character, String> mapping,
            StringBuilder currentCombination,
            List<String> result
    ) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = mapping.get(digit);
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(digits, index + 1, mapping, currentCombination, result);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}
