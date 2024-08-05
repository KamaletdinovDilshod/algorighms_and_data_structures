package leetcode.medium;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        System.out.println(search(nums, 1));
    }

    public static boolean search(int[] nums, int target) {
        int i = 0;
        int pivot = 0;
        int low;
        int high;
        int mid;
        while (i < nums.length - 1) {
            int j = i + 1;
            if (nums[i] > nums[j]) {
                pivot = j;
                break;
            }
            i++;
        }
        if (target <= nums[nums.length - 1]) {
            low = pivot;
            high = nums.length - 1;
        } else {
            low = 0;
            high = pivot-1;
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
