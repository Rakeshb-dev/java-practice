package com.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "AB";
           if(reverse(s,0,s.length()-1)){
               System.out.println("Palindrome");
           }
           else{
               System.out.println("not a palindrome");
           }
    }
    public static boolean reverse(String s,int start,int end){
        if(start>=end){
            return true;
        }
        return (s.charAt(start)==s.charAt(end)) && reverse(s,s.length()+1,s.length()-1);
    }
}
