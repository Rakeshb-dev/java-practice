package com.first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int duplicate = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            duplicate = duplicate*10 + digit;
            temp /= 10;
        }
        if(duplicate == num){
            System.out.println("The given is Palindrome");
        }
        else{
            System.out.println("The given number is Not a palindrome");
        }
    }
}
