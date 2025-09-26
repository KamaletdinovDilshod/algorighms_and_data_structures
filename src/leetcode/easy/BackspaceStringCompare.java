package leetcode.easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "#abx";
        String t = "d#abx";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '#') st.push(s.charAt(i));
            else if (!st.isEmpty()) st.pop();
        }
        String s1 = st.toString();
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) != '#') st2.push(t.charAt(j));
            else if (!st2.isEmpty()) st2.pop();
        }
        String s2 = st2.toString();
        return s1.equals(s2);
    }
}
