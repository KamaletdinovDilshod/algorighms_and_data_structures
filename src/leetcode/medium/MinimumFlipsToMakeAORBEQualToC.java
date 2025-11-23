package leetcode.medium;

public class MinimumFlipsToMakeAORBEQualToC {
    public static void main(String[] args) {
        System.out.println(minFlips(10, 9, 1));
    }


    public static int minFlips(int a, int b, int c) {

        int counter = 0;

        while (c > 0 || a > 0 || b > 0) {
            int lastBitA = (a & 1);
            int lastBitB = (b & 1);
            int lastBitC = (c & 1);

            if (lastBitC == 0) {
                if (lastBitB == 1 && lastBitA == 1) {
                    counter += 2;
                } else if (lastBitA != 0 || lastBitB != 0) {
                    counter += 1;
                }
            } else {
                if (lastBitB == 0 && lastBitA == 0) {
                    counter += 1;
                }
            }

            c >>= 1;
            b >>= 1;
            a >>= 1;
        }
        return counter;
    }
}
