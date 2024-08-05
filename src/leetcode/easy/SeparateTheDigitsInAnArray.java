package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateTheDigitsInAnArray {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> arl = new ArrayList<>();
        for (int i : nums) {
            arl.addAll(separateString(String.valueOf(i)));
        }
        int[] result = new int[arl.size()];
        for (int i = 0; i < arl.size(); i++) {
            result[i] = arl.get(i);
        }
        return result;
    }

    public static ArrayList<Integer> separateString(String num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (char n : num.toCharArray()) {
            arrayList.add(n - '0');
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }
}
