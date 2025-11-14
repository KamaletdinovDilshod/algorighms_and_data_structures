package leetcode.easy;

public class ReverseBits {
    public static void main(String[] args) {
        int num = 11; // Binary: 00000000000000000000000000001011
        int reversed = reverseBits(num); // E
    }

    public static int reverseBits(int n) {

        int reversedNum = 0;

        for (int i = 0; i < 32; i++) {
            reversedNum <<= 1;

            if ((n & 1) == 1) {
                reversedNum |= 1;
            }

            n >>= 1;
        }

        return reversedNum;
    }
}
