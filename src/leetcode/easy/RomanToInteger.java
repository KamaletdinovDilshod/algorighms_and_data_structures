package leetcode.easy;


import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int intOfRom = 0;
for (int i = 0; i < s.length(); i++){
    if (i > 0 && hm.get(s.charAt(i)) > hm.get(s.charAt(i-1))) {
        intOfRom += hm.get(s.charAt(i)) - 2 * hm.get(s.charAt(i-1));
    } else {
        intOfRom += hm.get(s.charAt(i));
    }
}
return intOfRom;
    }
}
