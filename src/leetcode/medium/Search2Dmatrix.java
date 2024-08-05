package leetcode.medium;

public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 34;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int low = 0;
            int high = ints.length - 1;
            if (target > ints[high]) continue;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (target == ints[mid]) {
                    return true;
                } else if (target < ints[mid]) {
                    high = mid - 1;
                } else if (target > ints[mid]) {
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}