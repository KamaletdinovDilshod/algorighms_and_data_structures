package leetcode.easy;

import java.util.HashMap;

public class DegreeOfAnArray {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> num_count = new HashMap<>();
        int degree = 0;
        HashMap<Integer, Integer> first_seen = new HashMap<>();
        int min_length = 0;
        for (int i =0; i < nums.length; i++){
            first_seen.putIfAbsent(nums[i], i);
            num_count.put(nums[i], num_count.getOrDefault(nums[i],0) + 1);
            if (num_count.get(nums[i]) > degree){
                degree = num_count.get(nums[i]);
                min_length = i - first_seen.get(nums[i]) + 1;
            } else if(num_count.get(nums[i]) == degree){
                min_length = Math.min(min_length ,i - first_seen.get(nums[i]));
            }
        }
        return min_length;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 3, 5, 4, 5, 6};
        System.out.println(findShortestSubArray(nums));
    }
}
