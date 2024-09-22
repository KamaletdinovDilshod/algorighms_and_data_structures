package leetcode.hard;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int firstNumsLength = nums1.length;
        int[] newArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (firstNumsLength > i) newArray[i] = nums1[i];
            else newArray[i] = nums2[i - firstNumsLength];
        }
        return 2.3;
    }
}
