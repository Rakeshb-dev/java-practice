package com.function;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the second value : ");
        int b = sc.nextInt();
        System.out.println("Multiplication of two number is " + mul(a,b));
    }

    public static int mul(int a,int b) {

        return a*b;
    }
}
