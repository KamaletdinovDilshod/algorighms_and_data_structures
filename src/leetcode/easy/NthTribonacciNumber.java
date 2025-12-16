package leetcode.easy;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {

        int[] t = new int[]{0, 1, 1};
        if (n < 3) return t[2];
        for (int i = 3; i < n + 1; i++) {
            int t2 = sum(t);
            t[0] = t[1];
            t[1] = t[2];
            t[2] = t2;
        }

        return t[2];
    }

    public static int sum(int[] array) {
        int res = 0;
        for (int a : array) {
            res += a;
        }
        return res;
    }
}
