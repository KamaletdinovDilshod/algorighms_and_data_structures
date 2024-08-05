package leetcode.easy;


public class ValidPolindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
    }

    public static boolean isPalindrome(String s) {
s = s.toLowerCase();
int i = 0;
int j = s.length() - 1;
while (i <= j) {
    while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i)))
        i++;
    while (j >= 0 && !Character.isLetterOrDigit(s.charAt(j)))
        j--;
    if (i < s.length() && j >= 0 && s.charAt(i) != s.charAt(j))
        return false;
    i++;
    j--;
}
        return true;
    }
    }

