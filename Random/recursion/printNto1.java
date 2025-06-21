package com.recursion;

import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fun2(a);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    public static void fun2(int n){
        if(n==0) {
            return;
        }
        fun2(n-1);
        System.out.print(n+" ");
    }
}
