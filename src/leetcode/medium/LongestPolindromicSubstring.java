package leetcode.medium;

public class LongestPolindromicSubstring {

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len2, len1);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);

    }
    public static int expandFromMiddle(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    //        String max="";
//        for(int i=0; i<s.length(); i++){
//            for(int j=i; j<s.length(); j++){
//                if(j-i>max.length()-1){
//                    String ans = helper(s, i, j);
//                    if(ans.length()>max.length()) max=ans;
//                }
//            }
//        }
//        return max;
//    }
//    public static String helper(String str, int x, int y){
//        String s1 = str.substring(x,y+1);
//        int i=0;
//        int j=s1.length()-1;
//        while(i<j){
//            if(s1.charAt(i++) != s1.charAt(j--))return "";
//        }
//        return s1;
//    }
    public static void main(String[] args) {
        String s = "aacabdkacaa";
        System.out.println(longestPalindrome(s));
    }
}
