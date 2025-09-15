package leetcode.easy;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String a = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String c = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        System.out.println("THIS IS LLLELE: " + 10 % 3);
//        String subbed = a.substring();

        System.out.println(gcdOfStrings(a, c));
    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1))
            return "";


        int n = gcd(str1.length(), str2.length());
        return str1.substring(0, n);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
