package leetcode.medium;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{1, 2, 3, 4}, 6));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += (long) Math.ceil((double) pile / k);
        }

        return hours <= h;
    }
}
