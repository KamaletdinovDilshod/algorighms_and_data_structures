package leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }

    public static List<String> fizzBuzz(int n) {
        LinkedList<String> al = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                al.add("FizzBuzz");
            } else if (i % 5 == 0) {
                al.add("Buzz");
            } else if (i % 3 == 0) {
                al.add("Fizz");
            } else {
                al.add(String.format("%d", i));
            }
        }
        return al;

        //Second Approach
//        List<String> ans=new ArrayList<>();
//        for (int i=1; i<=n;i++){
//            if(i%3==0 && i%5==0) ans.add("FizzBuzz");
//            else if(i%3==0) ans.add("Fizz");
//            else if(i%5==0) ans.add("Buzz");
//            else ans.add(i +"");
//        }
//        return ans;


    }
}
