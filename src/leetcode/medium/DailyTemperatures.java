package leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {

        int[] tempratures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(tempratures)));

    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> mst = new Stack<>();

        int size = temperatures.length;
        int[] result = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            while (!mst.isEmpty() && temperatures[i] >= temperatures[mst.peek()]) {
                mst.pop();
            }

            if (!mst.isEmpty()) {
                result[i] = mst.peek() - i;
            }

            mst.push(i);
        }
        return result;
    }
}
