package leetcode.easy;


public class CountDistinctNumbersOnBoard {
    public static int distinctIntegers(int n) {
        return (n==1) ? 1 : (n-1);
    }
    public static void main(String[] args) {
        distinctIntegers(5);
    }
}
