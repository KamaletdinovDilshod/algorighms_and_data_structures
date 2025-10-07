package leetcode.medium;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        decodeString(s);

    }

    public static String decodeString(String s) {

        Stack<Integer> numbers = new Stack<>();
        Stack<StringBuilder> stringBuilders = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;



        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                numbers.push(n);
                n = 0;
                stringBuilders.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = numbers.pop();
                StringBuilder tmp = sb;
                sb = stringBuilders.pop();
                while (k-- > 0) {
                    sb.append(tmp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
