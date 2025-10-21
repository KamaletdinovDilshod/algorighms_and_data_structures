package leetcode.medium;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPositions {
    public static void main(String[] args) {
        successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7L);
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int low = 0, high = potions.length - 1, idx = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if ((long) spells[i] * potions[mid] >= success) {
                    idx = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println("THIS IS IDX BABY: " + idx);
            if (idx != -1) res[i] = potions.length - idx;
        }

        return res;
    }
}
