package leetcode.easy;

public class CountTheDigitsThatDivideANumber {
    public static int countDigits(int num) {
        int d = num;
        int c = 0;
        while (d != 0) {
            int div = d % 10;
            if (div != 0 && num % div == 0) c += 1;
            d /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println(countDigits(a));
    }

}
