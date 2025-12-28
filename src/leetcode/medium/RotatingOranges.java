package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

class Cell {
    int x, y, t;

    Cell(int x, int y, int t) {
        this.x = x;
        this.y = y;
        this.t = t;
    }
}

public class RotatingOranges {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        int[][] grid2 = {{0, 2}};
        int[][] grid4 = {{1, 2}};

        int[][] grid3 = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        System.out.println(orangesRotting(grid));
        System.out.println(orangesRotting(grid2));
        System.out.println(orangesRotting(grid3));
        System.out.println(orangesRotting(grid4));
    }

    public static int orangesRotting(int[][] grid) {
        Queue<Cell> queue = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;

        int countFresh = 0;
        int[][] visited = new int[rows][cols];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                if (grid[x][y] == 2) {
                    queue.add(new Cell(x, y, 0));
                    visited[x][y] = 2;
                }

                if (grid[x][y] == 1) countFresh++;
            }
        }

        int tm = 0;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        int cnt = 0;
        while (!queue.isEmpty()) {
            int x = queue.peek().x;
            int y = queue.peek().y;
            int t = queue.peek().t;

            tm = Math.max(tm, t);
            queue.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = x + drow[i];
                int ncol = y + dcol[i];
                if (
                        nrow >= 0 &&
                                nrow < rows &&
                                ncol >= 0 &&
                                ncol < cols &&
                                visited[nrow][ncol] == 0 &&
                                grid[nrow][ncol] == 1
                ) {
                    queue.add(new Cell(nrow, ncol, t + 1));
                    visited[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if (cnt != countFresh) return -1;
        return tm;
    }
}
