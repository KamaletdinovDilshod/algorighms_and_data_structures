package leetcode.medium;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] arrray = new int[m][n];
        int sum = 0;
        for (int j = 0; j < n; j++) {
            arrray[0][j] = 1;
        }
        for (int i = 0; i < m; i++) {
            arrray[i][0] = 1;
        }
        for (int k = 0; k < m - 1; k++) {
            int q = k + 1;
            for (int a = 1; a < n; a++) {
                int l = a - 1;
                sum = arrray[k][a] + arrray[q][l];
                arrray[q][l + 1] = sum;
            }
        }
        return sum;
    }
}
