package leetcode.medium;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findPeakElement2(new int[]{1, 2, 3, 4, 5}));
    }

    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i], prev = i == 0 ? Integer.MIN_VALUE : nums[i - 1], next = i == nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1];

            if (curr >= prev && curr >= next) return i;
        }

        return -1;
    }

    // solution with binary search

    public static int findPeakElement2(int[] nums) {
        int L = 0, R = nums.length - 1;

        while (L < R) {
            int mid = (L + R) / 2;

            if (nums[mid] > nums[mid + 1]) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }

        return L;
    }
}
