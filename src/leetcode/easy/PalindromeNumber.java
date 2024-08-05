package leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));


    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        int temp = x;
        int last;
        while (temp != 0) {
            last = temp % 10;
            reversed = reversed  * 10 + last;
            temp /= 10;
        }
        return reversed == x;
    }
}
