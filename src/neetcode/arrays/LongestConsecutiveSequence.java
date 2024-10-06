package neetcode.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println((longestConsecutive(new int[]{2, 20, 4, 10, 3, 4, 5})));
        System.out.println((longestConsecutive(new int[]{0, 3, 2, 5, 4, 6, 1, 1})));
        System.out.println((longestConsecutive(new int[]{1})));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        int lengthOfTheLongest = 1;
        for (int num : nums) {
            hs.add(num);
        }

        for (int num : nums) {
            if (!hs.contains(num - 1)) {
                int j = num;
                int acc = 1;
                while (hs.contains(j + 1)) {
                    acc++;
                    j++;
                    if (acc > lengthOfTheLongest) lengthOfTheLongest = acc;
                }
            }
        }
        return lengthOfTheLongest;
    }
}
