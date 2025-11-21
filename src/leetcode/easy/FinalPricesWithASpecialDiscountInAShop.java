package leetcode.easy;

import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(arr)));
    }

    public static int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = prices.length-1;i >= 0; i--){
            while(!stack.isEmpty() && prices[i] < stack.peek()){
                stack.pop();
            }
            int small = stack.isEmpty() ? 0 : stack.peek();
            ans[i] = prices[i] - small;
            stack.push(prices[i]);
        }
        return ans;
    }
}
