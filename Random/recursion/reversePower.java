package com.recursion;

public class reversePower {
    public static void main(String[] args) {
        System.out.println(reverseExponentiation(2));
    }
        public static int reverseExponentiation(int n) {
            int temp = n;
            int rev =0;
            while(temp>0){
                int digit =temp%10;
                rev = rev *10 + digit;
                temp/=10;
            }
            return (int)Math.pow(n,rev);
        }
    }
