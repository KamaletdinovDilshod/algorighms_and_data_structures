package leetcode.easy;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] abs = {-4, -3, -2, -1, 4, 3, 2};

        System.out.println(largestAltitude(abs));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;

        for (int i = 0; i < gain.length; i++) {

            if (i != 0) {
                gain[i] += gain[i - 1];
            }

            max = Math.max(gain[i], max);
        }

        return max;
    }
}
