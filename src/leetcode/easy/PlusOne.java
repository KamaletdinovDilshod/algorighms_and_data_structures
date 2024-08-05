package leetcode.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 0, 9};
        int[] digits2 = {0};
        int[] digits3 = {2, 4, 9, 3, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
    }

    public static int[] plusOne(int[] digits) {
//     int n = digits.length;
//     int mem;
//     if (digits[n-1] != 9) {
//         digits[n-1] += 1;
//         return  digits;
//     } else {
//         mem = 1;
//         for (int i = n -1; i >= 0; i--) {
//             if (digits[i] != 9) {
//                 digits[i] += mem;
//                 mem = 0;
//             } else digits[i] = mem != 0 ? 0 : digits[i];
//         }
//     }
//     if (mem == 0) {
//         return digits;
//     } else {
//         int [] res = new int[n+1];
//         System.arraycopy(digits, 0, res, 1, n);
//         res[0] = mem;
//         return res;
// }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            if (res[0] == 0) {
                res[0] = 1;
                return res;
            }
        }
        return digits;
    }
}
//    int n = digits.length;
//    int mem;
//        if (digits[n - 1] != 9) {
//                digits[n - 1] += 1;
//                return digits;
//                } else {
//                mem = 1;
//                for (int i = n - 1; i >= 0; i--) {
//                if (digits[i] != 9) {
//                digits[i] += mem;
//                mem = 0;
//                } else {
//                digits[i] = mem != 0 ? 0 : digits[i];
//                }
//                }
//                if (mem == 0) {
//                return digits;
//                } else {
//                int[] res = new int[n + 1];
//                System.arraycopy(digits, 0, res, 1, n);
//                res[0] = mem;
//                return res;
//                }
//                }