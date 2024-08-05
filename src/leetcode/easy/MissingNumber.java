package leetcode.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {0};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums2));
        System.out.println(missingNumber(nums3));
    }

    public static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        System.out.println(Arrays.toString(nums));
//        int counter = 0;
//        if (nums.length == 1 && nums[0] == 0){
//            return 1;
//        }
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == counter) {
//                counter++;
//            } else {
//                return counter;
//            }
//            if (counter == nums[n - 1]) {
//                return (nums[n - 1] + 1);
//            }
//        }
//        return 0;

//int n = nums.length;
//int sum1 = 0;
//int sum2 = 0;
//for (int i = 0; i < n; i++) {
//    sum1 += nums[i];
//}
//sum2 = sum2 + (n + 1) * n / 2;
//int res  = sum2 - sum1;
//return res;

        // Using Xor Method
        int xor = 0;
        int i = 0;
        for (; i < nums.length; ++i){
        xor ^= nums[i];
        xor ^= i;
    }
        xor ^= i;
        return xor;
    }
}
