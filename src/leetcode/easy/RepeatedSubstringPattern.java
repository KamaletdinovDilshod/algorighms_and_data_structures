package leetcode.easy;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(s.substring(0, 1));
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int num_of_repeats = len / i;
                String str = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num_of_repeats; j++) {
                    sb.append(str);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
