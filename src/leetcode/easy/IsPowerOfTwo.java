package leetcode.easy;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1073741824));
    }

    public static boolean isPowerOfTwo(int n) {
        while (n > 1) {
            int r = n % 2;
            if (r != 0) return false;
            n = n / 2;
        }
        return true;
    }
}
