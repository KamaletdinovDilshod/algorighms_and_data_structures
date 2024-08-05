package leetcode.easy;

import java.util.LinkedList;
import java.util.List;
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
int[] nums2 = {1, 1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers(nums2));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums.length;
//        HashSet<Integer> hs = new HashSet<>();
//        List<Integer> res = new ArrayList<>();
//        for (int j = 0; j < n; j++) {
//            res.add(nums[j]);
//        }
//        int i = 1;
//        while (i <= n) {
//            if (hs.contains(i)) {
//                i++;
//            } else {
//                res.add(i);
//                i++;
//            }
//        }
//        return res;
        LinkedList<Integer> list = new LinkedList<>();
        int n = nums.length;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) arr[nums[i] - 1] = true;
        for (int i = 0; i < n; i++) if (!arr[i]) list.add(i+1);
        return list;
    }
}
