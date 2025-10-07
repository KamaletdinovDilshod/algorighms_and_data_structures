package leetcode.medium;

import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append('a').append('b');
        System.out.println(sb.toString());
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars2("leet**cod*e"));
    }

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                st.add(ch);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }

        StringBuilder newSt = new StringBuilder();

        while (!st.isEmpty()) {
            newSt.insert(0, st.pop());
        }
        return newSt.toString();
    }

    public static String removeStars2(String s) {
        int star = 0, i = s.length();

        StringBuilder sb = new StringBuilder();

        while (i-- > 0) {
            if (s.charAt(i) == '*') star++;
            else if (star == 0) sb.insert(0, s.charAt(i));
            else star--;
        }
        return sb.reverse().toString();
    }
}
