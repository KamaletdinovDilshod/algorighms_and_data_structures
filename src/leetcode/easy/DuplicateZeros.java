package leetcode.easy;

import java.util.Stack;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) stack.add(arr[i]);
        for (int i = 0; i < arr.length; i++) {
            if (stack.peek() != 0) {
                arr[i] = stack.pop();
            } else {
                arr[i++] = stack.pop();
                try {
                    arr[i] = 0;
                } catch (Exception e) {
                    break;
                }
            }
        }
    }
}
