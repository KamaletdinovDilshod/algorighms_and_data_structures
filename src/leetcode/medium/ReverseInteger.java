package leetcode.medium;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 12345678;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int reminder;
        int num = 0;
        boolean isNegative = x < 0;
        if (isNegative) x *= -1;
        while (x > 0) {
            if (num > Integer.MAX_VALUE / 10) return 0;
            reminder = x % 10;
            x = x / 10;
            num = num * 10 + reminder;
        }
        if (isNegative) num *= -1;
        return num;
    }
}
