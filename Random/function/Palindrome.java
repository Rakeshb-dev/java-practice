package com.function;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int val = sc.nextInt();
        if(palindrome(val)){
            System.out.println("The given value is a palindrome");
        }
        else{
            System.out.println("The given value is not a palindrome");
        }
    }
    public static boolean palindrome(int val){
        int original = val;
        int reversed =0;
        while(val>0){
            int digit = val%10;
            reversed= reversed *10+digit;
            val /= 10;
        }
        return original==reversed;
    }
}
