package com.bit;

public class count {
    public static void main(String[] args) {
           if(reverse(101)){
               System.out.println("Palindrome");
           }
           else{
               System.out.println("Not Palindrome");
           }
    }
    public static boolean reverse(int n){
        int temp =n;
        int rev=0;
        while(temp>0){
            int digit = temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        return(rev==n);
    }
}
