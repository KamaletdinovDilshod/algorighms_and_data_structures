package leetcode.medium;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        System.out.println(findCircleNum(isConnected));
    }

    public static int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;
        boolean[] isVisited = new boolean[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                count++;
                dfs(isConnected, i, isVisited);
            }
        }

        return count;
    }

    private static void dfs(int[][] isConnected, int i, boolean[] isVisited) {
        for (int j = 0; j < isConnected[i].length; j++) {
            if (!isVisited[j] && isConnected[i][j] != 0) {
                isVisited[j] = true;
                dfs(isConnected, j, isVisited);
            }
        }
    }


}
