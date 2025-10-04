package leetcode.easy;

import java.lang.reflect.Array;
import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {80, 5, -20, 33, 26, 29};
        int[] nums2 = {-69, 0, -36, 52, -84, -34, -67, -100, 80};

        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Find elements in set1 that are NOT in set 2
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        return Arrays.asList(list1, list2);
    }
}
