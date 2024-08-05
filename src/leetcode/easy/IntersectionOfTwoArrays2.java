package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};
intersect(num1, num2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int m = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<>();
        while (i < nums1.length && m < nums2.length) {
            if (nums1[i] == nums2[m]) {
                arr.add(nums1[i]);
                i++;
                m++;
            } else if (nums1[i] < nums2[m]) {
                i++;
            } else {
                m++;
            }
        }
        int[] array = new int[arr.size()];
        int k = 0;
        for (int num : arr) array[k++] = num;
        System.out.println(Arrays.toString(array));
        return array;
    }
}
