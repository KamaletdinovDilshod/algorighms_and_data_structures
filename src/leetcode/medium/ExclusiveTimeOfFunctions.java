package leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {
    public static void main(String[] args) {
        List<String> st = List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7");
        System.out.println(Arrays.toString(exclusiveTime(2, st)));
    }

    public static int[] exclusiveTime(int n, List<String> logs) {

        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String st : logs) {
            String[] values = st.split(":");

            int id = Integer.parseInt(values[0]);
            int time = Integer.parseInt(values[2]);
            String type = values[1];

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    res[stack.peek()] += time - prevTime;
                }
                stack.push(id);
                prevTime = time;
            } else {
                res[stack.pop()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }

        return res;
    }


}
