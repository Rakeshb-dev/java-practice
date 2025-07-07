package com.Loop;

import java.util.Scanner;

public class Sum_Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sum(a)*b;
        System.out.println(sum(c));
    }
    public static int sum(int num){
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }

}
