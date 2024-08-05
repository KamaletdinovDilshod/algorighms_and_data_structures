package leetcode.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "  fly me   to   the moon  ";
        String s2 = "";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s2));

    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                return counter;
            } else if (i == 0) {
                return counter + 1;
            } else {
                counter++;
            }
        }
        return counter;
    }
}
