package leetcode.medium;

import java.util.Collections;
import java.util.PriorityQueue;


public class MaxKElements {
    public static long maxKelements(int[] nums, int k) {

        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Collections.reverseOrder());
        for (int num: nums) {
            pq.add(num);
        }
        for (int i = 1; i <= k; i++) {
            int el = pq.poll();
            score += el;

            double d = (double) el / 3;
            pq.add((int) Math.ceil(d));
        }
        return score;
    }
    public static void main(String[] args) {
        int[] nums = {1, 10, 3, 3, 3};
        System.out.println(maxKelements(nums, 3));
    }
}
