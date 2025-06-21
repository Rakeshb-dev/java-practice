package com.first_java;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;

        int n = sc.nextInt();
        System.out.print("0 1 ");
        for(int i = 2;i<n;i++){
            int next = a+b;
            a = b;
            b = next;
            System.out.print(next +" ");
        }


    }
}
