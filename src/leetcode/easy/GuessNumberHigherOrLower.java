package leetcode.easy;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

    }

    int guess(int num) {
        return 5;
    }

    public int guessNumber(int n) {
        int high = n;
        int low = 1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;

            switch (guess(mid)) {
                case -1:
                    high = mid - 1;
                    low = 1;
                    break;
                case 1:
                    low = mid + 1;
                    break;
                case 0:
                    return mid;
            }
        }
        return mid;
    }
}
