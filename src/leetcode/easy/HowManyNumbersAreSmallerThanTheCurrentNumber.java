package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = nums.clone();

        Arrays.sort(result);
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            index.putIfAbsent(result[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = index.get(nums[i]);
        }

        return result;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] count = new int[101];
        int n = nums.length;
        for (int num : nums) count[num]++;

        int[] smallerCount = new int[101];
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            smallerCount[i] = sum;
            sum += count[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = smallerCount[nums[i]];
        }

        return result;
    }
}
