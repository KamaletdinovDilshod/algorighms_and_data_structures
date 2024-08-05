package leetcode.easy;


public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        char tmp;
        while (i <= j) {
            if (Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            } else if (Character.isLetter(arr[i]) && !Character.isLetter(arr[j])) {
                j--;
            } else if (!Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}
