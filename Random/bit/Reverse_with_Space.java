package com.bit;

public class Reverse_with_Space {
    public static void main(String[] args) {
        String s = "Hi Hello dear";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        int n =0;
        StringBuilder sb = new StringBuilder();
        while(n<s.length()){
            if(s.charAt(n)!=' '){
                sb.insert(0,s.charAt(n));
            }
            n++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                sb.insert(i,' ');
            }
        }
        return sb.toString();
    }

}
