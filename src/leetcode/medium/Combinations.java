package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Combinations {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));

    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(1, n, k, list, ans, new HashSet<>());
        return ans;
    }
    public static void backtrack(int idx, int n, int k, List<Integer> list, List<List<Integer>> ans, HashSet<Integer> seen) {
        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i <= n; i++) {
            if (!seen.contains(i)) {
                seen.add(i);
                list.add(i);
                backtrack(i + 1,n, k, list, ans, seen);
                seen.remove(i);
                list.remove(list.size() - 1);
            }
        }
    }

}
