package leetcode.easy;


public class AddString {
    public static void main(String[] args) {
        String num1 = "1", num2 = "9";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        int max = Integer.max(num1.length(), num2.length());
        char[] res = new char[max + 1];
        int n1 = num1.length();
        int n2 = num2.length();
        byte sum = 0;
        for (int i = n1 - 1, j = n2 - 1, k = res.length - 1; i >= 0 || j >= 0; i--, j--, k--) {
            if (i >= 0) sum += (num1.charAt(i)) - '0';
            if (j >= 0) sum += (num2.charAt(j)) - '0';
            res[k] = (char) ('0' + sum);
            if (sum >= 10) {
                res[k] -= 10;
                sum = 1;
            } else {
                sum = 0;
            }
        }
        if (sum == 0) {
            return new String(res, 1, res.length - 1);
        } else {
            res[0] = '1';
            return new String(res);
        }

        // Big Integer
//        BigInteger b1 = new BigInteger(num1);
//        BigInteger b2 = new BigInteger(num2);
//        b1 = b1.add(b2);
//        return b1.toString();
    }
}
