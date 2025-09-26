package leetcode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        productExceptSelf2(a);
    }


    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        System.out.println(Arrays.toString(res));
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    // Solution 2
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        // Fill prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        System.out.println(Arrays.toString(prefix));

        // Fill suffix array
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        System.out.println(Arrays.toString(suffix));

        // Calculate the result
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
