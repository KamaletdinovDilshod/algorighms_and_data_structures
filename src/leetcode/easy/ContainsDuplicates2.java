package leetcode.easy;

import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {99, 99, 55, 66};
        int[] nums2 = {1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums, 5));
        System.out.println(containsNearbyDuplicate(nums2, 1));
        System.out.println(containsNearbyDuplicate(nums3, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        int n = nums.length;
        if (k >= n - 1) {
            k = n - 1;
        }
        for (int i = 0; i <= k; i++) {
            if (st.contains(nums[i])) {
                return true;
            }
            st.add(nums[i]);
        }
        int j = 0;
        for (int i = k + 1; i < n; i++) {
            st.remove(nums[j++]);

            if (st.contains(nums[i])) {
                return true;
            }
            st.add(nums[i]);
        }
        return false;
    }
}