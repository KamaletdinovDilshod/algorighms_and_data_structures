package leetcode.easy;

public class FindTheHighestAltitude {
    public static void main(String[] args) {

    }

    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;

        for (int j : gain) {
            sum += j;
            max = Math.max(sum, max);
        }

        return max;
    }
}
