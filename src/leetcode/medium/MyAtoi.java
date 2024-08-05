package leetcode.medium;

public class MyAtoi {
    public static void main(String[] args) {
        String s = "87";
        System.out.println(myAtoi(s));

    }

    public static int myAtoi(String s) {
//        String inp = s.trim();
//
//        if(inp.length() == 0){
//            return 0;
//        }
//
//        int chars = 0;
//
//        boolean neg = inp.charAt(0) == '-';
//
//        long n = 0;
//        for(int i = 0; i<inp.length(); i++){
//
//            if(i == 0 && (inp.charAt(i) == '-' || inp.charAt(i) == '+')){
//                continue;
//            }
//
//            if(chars > 10){
//                break;
//            }
//
//            if(inp.charAt(i) - 48 >=0 && inp.charAt(i) - 48 <=9){
//                n = n*10 + (inp.charAt(i) - 48);
//                if(n == 0 && (inp.charAt(i) - 48) == 0){
//                    continue;
//                }
//                else{
//                    chars++;
//                }
//            }
//
//            else break;
//
//        }
//
//
//        if(neg){
//            n = -n;
//        }
//
//        if(n<-2147483648){
//            n = -2147483648;
//        }
//        else if(n>2147483647){
//            n = 2147483647;
//        }
//
//        return (int)n;
        s = s.trim();
        if (s.length() == 0) return 0;
        int num;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(sb);
            char c = s.charAt(i);
            if (i == 0 && c == '-' || i == 0 && c == '+') {
                sb.append(c);
            } else if (!Character.isDigit(c)) {
                break;
            } else if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        try {
            num = Integer.parseInt(String.valueOf(sb));
        } catch (NumberFormatException e) {
            if (sb.length() == 1 || sb.length() == 0) return 0;
            else if (sb.charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        return num;
    }
}
