package leetcode.easy;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));

    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                boolean case1 = isPol(i, j - 1, s);
                if (case1) {
                    return true;
                }
                return isPol(i + 1, j, s);

            }
        }
        return true;
    }

    public static boolean isPol(int i, int j, String s) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
