package leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices3 = {2, 1, 2, 1, 0, 1, 2};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices4 = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices3));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices4));
    }

    public static int maxProfit(int[] prices) {
int maxProfit = 0;
int j = 0;
int diff;
for (int i = 1; i < prices.length; i++) {
    diff = prices[i] - prices[j];
    if (diff < 0) j = i;
    else maxProfit = Math.max(maxProfit, diff);
}
return maxProfit;

//        int i = 0;
//        int j = i + 1;
//        int maxProfit = 0;
//        int profit;
//        while (j < prices.length) {
//            profit = prices[j] - prices[i];
//            if (profit <= 0) {
//                i++;
//                j = i+1;
//            } else {
//                if (profit > maxProfit)
//                    maxProfit = profit;
//                j++;
//            }
//        }
//        return maxProfit;
//       int largestDifference = 0;
//       for (int buyDay = 0; buyDay < prices.length; buyDay++) {
//           for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
//               int currentDifference = prices[sellDay] - prices[buyDay];
//
//               if (currentDifference > largestDifference) {
//                   largestDifference = currentDifference;
//               }
//           }
//       }
//       return largestDifference;
    }
    // time complexity = O(n^2)
    //space complexity = O(1)
}
