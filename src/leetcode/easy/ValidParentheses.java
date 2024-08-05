package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = ")(";
        String s2 = "[{";

        System.out.println(isValid(s));
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == map.get(stack.peek())) {
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }
}
