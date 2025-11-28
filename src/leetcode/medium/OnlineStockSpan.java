package leetcode.medium;

import java.util.Stack;

public class OnlineStockSpan {

    public static void main(String[] args) {

        StockSpanner sp = new StockSpanner();
        System.out.println(sp.next(5));

    }

}

class StockSpanner {

    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});
        return span;
    }
}