package leetcode.easy;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(10, 15));
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(countBits(i))) count++;
        }

        return count;
    }

    public static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
