package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        System.out.println(getRow(2));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> sublist, prev = null;

        for (int i = 0; i <= rowIndex; i++) {
            sublist = new ArrayList<>();
            for (int j = 0; j <= i; j++)
                if (j == 0 || j == i)
                    sublist.add(1);
                else {
                    sublist.add(prev.get(j - 1) + prev.get(j));
                }
            prev = sublist;
        }
        return prev;
    }
}
