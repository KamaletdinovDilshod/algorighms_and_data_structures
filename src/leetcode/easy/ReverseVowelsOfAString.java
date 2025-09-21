package leetcode.easy;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        char[] res = s.toCharArray();

        int i = 0;
        int j = res.length - 1;

        while (i < j) {
            if (isVowel(res[i]) && isVowel(res[j])) {
                char temp = res[i];
                res[i] = res[j];
                res[j] = temp;
                i++;
                j--;
            } else if (isVowel(res[i])) {
                j--;
            } else if (isVowel(res[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }


        return String.valueOf(res);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' ||
                ch == 'A' ||
                ch == 'o' ||
                ch == 'O' ||
                ch == 'i' ||
                ch == 'I' ||
                ch == 'e' ||
                ch == 'E' ||
                ch == 'u' ||
                ch == 'U';
    }
}
