package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        buildArray(arr, 4);
        System.out.println(buildArray(arr, 4));
    }

    public static List<String> buildArray(int[] target, int n) {

        int index = 0;
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n && index < target.length; i++) {
            res.add("Push");

            if (target[index] != i) {
                res.add("Pop");
            } else {
                index++;
            }
        }

        return res;
    }
}
