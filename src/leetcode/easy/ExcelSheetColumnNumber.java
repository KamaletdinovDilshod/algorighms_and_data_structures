package leetcode.easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
String s = "ZZ";
        System.out.println(titleToNumber(s));
    }
    public static int titleToNumber(String columnTitle) {
 int res = 0;
 for (int i = 0; i<columnTitle.length(); i++){
     res = res*26 + (columnTitle.charAt(i) - 'A' + 1);
 }
 return res;
    }
}
