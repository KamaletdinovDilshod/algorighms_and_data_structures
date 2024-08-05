package leetcode.easy;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s) {
        int curr = 1, prev = 0, res = 0;
        int n = s.length();
        for (int i = 0; i < n-1; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if (ch == ch2) curr++;
            else {
                res += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        return res + Math.min(prev, curr);
    }
}