package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int num : nums1) {
            hs.add(num);
        }
        for (int num2 : nums2) {
            if (hs.contains(num2)) {
                hs2.add(num2);
            }
        }
        int[] arr = new int[hs2.size()];
        int i = 0;
        for (int item : hs2){
            arr[i] = item;
            i++;
        }
        return arr;
    }
}


