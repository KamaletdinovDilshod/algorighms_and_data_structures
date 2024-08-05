package leetcode.easy;

import java.util.Arrays;

public class SortArraybyParity2 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int e = 0, o = 1;
        int[] ans = new int[nums.length];
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[e] = num;
                e = e + 2;
            } else {
                ans[o] = num;
                o = o + 2;
            }
        }
        return ans;
//        int[] newArr = new int[nums.length];
//        Stack<Integer> even = new Stack<>();
//        Stack<Integer> odd = new Stack<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                even.push(nums[i]);
//            } else {
//                odd.push(nums[i]);
//            }
//        }
//        int j = 0;
//        while (j < nums.length && !even.isEmpty() && !odd.isEmpty()) {
//            newArr[j++] = even.pop();
//            newArr[j++] = odd.pop();
//        }
//        return newArr;
    }
}
