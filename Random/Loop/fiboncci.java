package com.Loop;

import java.util.Scanner;

public class fiboncci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers u need in series : ");
        int series = sc.nextInt();
        int a= 0;
        int b= 1;
        System.out.print(a +" " + b+" ");
        for(int i =2;i<series;i++){
            int next = a+ b;
            a =b;
            b = next;
            System.out.print(next + " ");
        }
    }
}
