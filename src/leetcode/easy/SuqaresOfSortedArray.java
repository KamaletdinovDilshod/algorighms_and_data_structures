package leetcode.easy;


public class SuqaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        sortedSquares(nums);

    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int idx = nums.length - 1;
        while (left <= right) {
            int leftAbs = Math.abs(nums[left]);
            int rightAbs = Math.abs(nums[right]);
            if (leftAbs < rightAbs) {
                res[idx] = rightAbs * rightAbs;
                right--;
            } else {
                res[idx] = leftAbs * leftAbs;
                left++;
            }
            idx--;
        }
        return res;
    }
}
