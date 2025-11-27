package leetcode.medium;

import java.util.PriorityQueue;


public class TotalCostToHireKWorkers {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8};
        System.out.println(totalCost(arr, 3, 4));
    }

    public static long totalCost(int[] costs, int k, int candidates) {

        int i = 0;
        int j = costs.length - 1;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;
        while (k-- > 0) {
            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[i++]);
            }
            while (pq2.size() < candidates && i <= j) {
                pq2.offer(costs[j--]);
            }

            int t1 = !pq1.isEmpty() ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = !pq2.isEmpty() ? pq2.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                ans += t1;
                pq1.poll();
            } else {
                ans += t2;
                pq2.poll();
            }

        }
        return ans;
    }
}
