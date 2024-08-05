package leetcode.easy;

public class SqrtX {
    public static void main(String[] args) {
        int x = 225;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int high = x;
        int low = 1;
        long mid;
        while (low <= high) {
            mid =  (low + (long)(high - low) / 2);
            if (mid * mid == x) return (int) mid;
            else if (mid * mid > x)  {
                high = (int)mid-1;
            } else if (mid * mid < x) {
                low = (int)mid + 1;
            }
        }
        return low - 1;
    }
}
