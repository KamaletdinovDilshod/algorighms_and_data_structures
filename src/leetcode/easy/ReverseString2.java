package leetcode.easy;

public class ReverseString2 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char [] chars = s.toCharArray();
        for (int start = 0; start < s.length(); start += 2 * k){
            int i = start, j = Math.min(start + k - 1, chars.length - 1);
                while (i < j) {
                    char tmp = chars[i];
                    chars[i++] = chars[j];
                    chars[j--] = tmp;
                }
            }
            return new String(chars);
        }

    }
//    public static String reverseStr(String s, int k) {
//        StringBuilder str = new StringBuilder(s);
//        if (str.length() <= k) {
//            return str.reverse().toString();
//        }
//        for (int i = 0; i < s.length(); i++) {
//            int m = i - 1;
//            int j = i + k - 1;
//            while (i < j && i < s.length() && j < s.length()) {
//                char tar = str.charAt(j);
//                str.replace(j, j + 1, String.valueOf(str.charAt(i)));
//                str.replace(i, i + 1, String.valueOf(tar));
//                j--;
//                i++;
//            }
//            i = m + 2 * k;
//        }
//        return str.toString();
//    }


//"yqzyhljrntdvxgneasmhafptyhlkmxwhqcdfnkbyhvdmfsbtvfovjbflvehxpdanugjvjqliqnfkjcqnadebemdqsg"
//"yqzyhljrnitdvxgneasemhafptyhlokmxwhqcdfenkbyhvdmfrsbtvfovjbdflvehxpdaonugjvjqlimqnfkjcqnajdebemdqsgl"