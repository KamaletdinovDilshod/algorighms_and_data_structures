package leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() + asteroids[i] < 0) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else if (stack.peek() + asteroids[i] == 0) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty() && i >= 0) {
            res[i] = stack.pop();
        }

        return res;
    }
}
