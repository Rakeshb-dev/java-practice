package com.recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(fibo(a));
    }

    private static int fibo(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibo(n-2)+fibo(n-1);
    }
}
