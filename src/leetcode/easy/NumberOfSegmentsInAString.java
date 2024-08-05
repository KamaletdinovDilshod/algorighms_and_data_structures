package leetcode.easy;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello"));
        System.out.println("".length());
    }

    public static int countSegments(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                counter++;
            }
        }
        return counter;

    }
}
