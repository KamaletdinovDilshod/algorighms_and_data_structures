package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntranceInMaze {
    public static void main(String[] args) {

        char[][] maze = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };

        int[] entrance = {1, 2};

        System.out.println(nearestExit(maze, entrance));
    }

    public static int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length, cols = maze[0].length, queueSize;
        int[] curr;

        Queue<int[]> queue = new LinkedList<>();

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int x, y, steps = 0;

        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            queueSize = queue.size();
            steps++;

            for (int i = 0; i < queueSize; i++) {
                curr = queue.poll();

                for (int[] dir : dirs) {
                    x = dir[0] + curr[0];
                    y = dir[1] + curr[1];

                    if (x < 0 || x >= rows || y < 0 || y >= cols) continue;
                    if (maze[x][y] == '+') continue;

                    if (x == 0 || x == rows - 1 || y == 0 || y == cols - 1) return steps;

                    queue.offer(new int[]{x, y});

                    maze[x][y] = '+';
                }
            }
        }
        return -1;
    }


}
