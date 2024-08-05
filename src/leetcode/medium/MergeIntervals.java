package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {4, 5}, {0, 0}, {1, 1}, {2, 3}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
     LinkedList<int[]> list = new LinkedList<>();
     for (int[] interval : intervals) {
         if (list.isEmpty() || list.getLast()[1] < interval[0]) {
             list.add(interval);
         } else {
             list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
         }
     }
     return list.toArray(new int[list.size()][]);
    }
}
