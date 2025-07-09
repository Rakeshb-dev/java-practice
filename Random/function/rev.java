package com.function;

import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int rev = 0;
        while (temp>0){
            int digit = temp %10;
            rev = rev* 10 + digit;
            temp /=10;
        }
        if(a==rev){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }
    }
}
