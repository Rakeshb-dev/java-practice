package com.function;

import java.util.Scanner;

public class Sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        System.out.println("The sum of digit "+sum(num));
    }
    public static int sum(int num){
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
