package leetcode.easy;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < magazine.length(); i++) {
//            char ch = magazine.charAt(i);
//            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch2 : ransomNote.toCharArray()) {
//            if (hm.containsKey(ch2)){
//                hm.put(ch2, hm.getOrDefault(ch2, 0)-1);
//            } else {
//                hm.put(ch2, hm.getOrDefault(ch2, 0) - 1);
//            }
//        }
//        for (int values : hm.values()) {
//            if (values < 0) return false;
//        }
//        return true;

        // Second Aproach
int[] arr = new int[26];
for (char ch : magazine.toCharArray()){
    arr[ch - 'a']++;
}
for (char ch : ransomNote.toCharArray()){
    if (arr[ch - 'a'] == 0)return false;
    else arr[ch - 'a']--;
}
        return true;
    }
}
