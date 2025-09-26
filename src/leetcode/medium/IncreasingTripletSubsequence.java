package leetcode.medium;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 4, 1, 3};
        System.out.println();
        System.out.println(increasingTriplet(arr));

    }

    public static boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) {
                small = n;
            } else if (n <= big) {
                big = n;
            } else return true;
        }

        return false;
    }
}
