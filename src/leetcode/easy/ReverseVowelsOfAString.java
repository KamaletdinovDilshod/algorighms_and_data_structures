package leetcode.easy;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < s.length() && !isVowel(res[i])) {
                i++;
            }
            while (j >= 0 && !isVowel(res[j])) {
                j--;
            }
            if (i < j) {
                char temp = res[i];
                res[i++] = res[j];
                res[j--] = temp;
            }
        }
        return new String(res);

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
