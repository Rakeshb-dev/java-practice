package com.Loop;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = Integer.MIN_VALUE;
        System.out.print("Enter the numbers to find the largest number (give zero to stop) : ");

        while(true){
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }

            if(num > Max){
                Max = num;
            }

        }
        System.out.println("The maximum value is " + Max);
    }
}
