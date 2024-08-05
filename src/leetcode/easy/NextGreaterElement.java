package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int j : nums2) {
            if (!st.isEmpty() && st.peek() < j) {
                hm.put(st.pop(), j);
            }
            st.push(j);
        }
        for (int i = 0; i < nums1.length; i++){
            nums1[i] = hm.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
