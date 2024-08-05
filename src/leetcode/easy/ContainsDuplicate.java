package leetcode.easy;


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {0, 4, 5, 0, 3, 6};
        int[] nums4 = {4, 0, 5, 0, 3, 6};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
        System.out.println(containsDuplicate(nums4));

    }

    public static boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (hm.containsKey(nums[i])) {
//                hm.put(nums[i], hm.get(nums[i]) + 1);
//            } else {
//                hm.put(nums[i], 1);
//            }
//            if (hm.get(nums[i]) > 1) return true;
//        }
//        return false;
//        Map<Integer, Boolean> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
//            if (map.putIfAbsent(nums[i], true) != null){
//                return true;
//            }
//        }
//        return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))return true;
            set.add(num);
        }
        return false;
    }
}

