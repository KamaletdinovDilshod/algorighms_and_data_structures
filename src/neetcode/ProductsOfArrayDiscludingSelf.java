package neetcode;

import java.util.Arrays;

public class ProductsOfArrayDiscludingSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        // From left to the right
        int mult = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = mult;
            mult = nums[i] * mult;
        }

        //From right to the left
        mult = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            res[j] = mult * res[j];
            mult = mult * nums[j];
        }

        return res;
    }
}
