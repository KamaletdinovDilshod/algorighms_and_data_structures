package leetcode.easy;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
//        System.out.println(3 / 2);
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
//        String max = (a.length() > b.length()) ? a : b;
//        String min = (a.length() <= b.length()) ? a : b;
//        String res = "";
//        int countMax = Math.max(a.length(), b.length()) - 1;
//        int countMin = Math.min(a.length(), b.length()) - 1;
//        int temp = 0;
//        int xor;
//        while (countMin >= 0) {
//            int minch = min.charAt(countMin) - '0';
//            int maxch = max.charAt(countMax) - '0';
//            xor =  minch ^ maxch;
//            xor = xor ^ temp;
//            res = ((char) (xor + '0')) + res;
//            if (maxch == 1 && minch == 1) {
//                temp = 1;
//            } else if (maxch == 0 && minch==0){
//                temp = 0;
//            } else if (maxch == 0 && minch == 1 && temp == 1)  {
//                temp = 1;
//            } else if (maxch == 1 && minch == 0 && temp == 1){
//                temp = 1;
//            }
//            countMin--;
//            countMax--;
//        }
//        while (countMax >= 0) {
//            int maxchar = max.charAt(countMax) - '0';
//            xor = temp ^ maxchar;
//            if (temp == 1 && maxchar == 0) {
//                temp = 0;
//            } else if(temp == 1 && maxchar == 1){
//                temp = 1;
//            } else {
//                temp = 0;
//            }
//            res = ((char) (xor + '0') + res);
//            countMax--;
//        }
//        if (temp == 1) {
//            res = ((char) (temp + '0') + res);
//        }
//        return res;
    }

}
