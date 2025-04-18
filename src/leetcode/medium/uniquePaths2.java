package leetcode.medium;



public class uniquePaths2 {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{1, 1}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        obstacleGrid[0][0] = 1;

        for (int i = 1; i < R; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return obstacleGrid[R - 1][C - 1];
//        if (obstacleGrid[0][0] == 1) return 0;
//        obstacleGrid[0][0] = 1;
//        for (int i = 1; i < obstacleGrid[0].length; i++) {
//            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
//        }
//        for (int j = 1; j < obstacleGrid.length; j++) {
//            obstacleGrid[j][0] = (obstacleGrid[j][0] == 0 && obstacleGrid[j - 1][0] == 1) ? 1 : 0;
//        }
//        for (int k = 1; k < obstacleGrid.length - 1; k++) {
//            for (int q = 1; q < obstacleGrid[0].length; q++) {
//                if (obstacleGrid[k][q] == 0) {
//                    obstacleGrid[k][q] = obstacleGrid[k - 1][q] + obstacleGrid[k][q - 1];
//                } else {
//                    obstacleGrid[k][q] = 0;
//                }
//            }
//        }
//        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
