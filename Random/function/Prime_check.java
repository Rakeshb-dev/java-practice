package com.function;

import java.util.Scanner;

public class Prime_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int val = sc.nextInt();
        if(prime(val)){
            System.out.println("The give Value is prime");
        }
        else{
            System.out.println("The give Value is not prime");
        }
    }
    public static boolean prime(int val) {
        if(val<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(val); i++) {

            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
