package com.function;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial : ");
        int val = sc.nextInt();
        System.out.println("Factorial of the given number is " + factorial(val));

    }
    public static int factorial(int val){
        if(val<0){
            return 0;
        }
        int fact=1;
        for(int i = 1;i<=val;i++){
            fact *= i;
        }
        return fact;
    }
}
