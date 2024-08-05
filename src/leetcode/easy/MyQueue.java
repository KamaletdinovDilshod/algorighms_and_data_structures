package leetcode.easy;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    int front;
    public MyQueue() {

    }

    public void push(int x) {
        if (!stack.isEmpty())
            front = x;
        while (!stack.isEmpty())
            stack2.push(stack.pop());
        stack2.push(x);
        while (!stack2.isEmpty())
            stack.push(stack2.pop());
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
       return stack.isEmpty();
    }
}
