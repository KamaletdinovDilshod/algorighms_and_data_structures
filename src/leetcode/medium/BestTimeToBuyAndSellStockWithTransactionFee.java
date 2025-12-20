package leetcode.medium;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        System.out.println(maxProfit(prices, 2));
    }

    public static int maxProfit(int[] prices, int fee) {

        int holding = -prices[0] - fee;
        int notHolding = 0;

        for (int i = 1; i < prices.length; i++) {
            notHolding = Math.max(notHolding, holding + prices[i]);
            holding = Math.max(holding, notHolding - prices[i] - fee);
        }

        return notHolding;
    }
}
