package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
        LinkedList<int[]> list = new LinkedList<>();
        int start = newInterval[0];
        for (int[] interval : intervals) {
            if (start != -1 && start < interval[0]) {
                merge2(list, newInterval);
                start = -1;
            }
            merge2(list, interval);
        }
        if (start != -1) merge2(list, newInterval);
        return list.toArray(new int[list.size()][]);
    }

    private static void merge2(LinkedList<int[]> list, int[] inter) {
        if (list.isEmpty() || list.getLast()[1] < inter[0]) {
            list.add(inter);
        } else {
            list.getLast()[1] = Math.max(list.getLast()[1], inter[1]);
        }
    }
}


