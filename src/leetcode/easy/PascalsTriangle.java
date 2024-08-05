package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(3));
        System.out.println(generate(29));
    }

    public static List<List<Integer>> generate(int numRows) {
     List<List<Integer>> list = new ArrayList<>();
     List<Integer> sublist, prev = null;
     for (int i = 0; i < numRows; i++) {
         sublist = new ArrayList<>();
         for (int j =0; j <= i; j++)
             if (j==0 || j == i)
                 sublist.add(1);
         else {
                 sublist.add(prev.get(j-1) + prev.get(j));
             }

         prev = sublist;
         list.add(sublist);
     }
     return list;
    }
}
