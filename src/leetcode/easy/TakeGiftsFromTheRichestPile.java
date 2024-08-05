package leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Collections.reverseOrder());
        for (int x : gifts) {
            pq.add(x);
        }

        long sum = 0;
        while (k -- > 0){
            pq.add((int)Math.sqrt(pq.remove()));
        }
        while (pq.size() > 0) {
            sum += pq.remove();
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }
}
