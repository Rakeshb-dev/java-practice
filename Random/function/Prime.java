package com.function;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range : ");
        int start = sc.nextInt();
        System.out.print("Enter the end range : ");
        int end = sc.nextInt();
        for(int i = start;i<=end;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static boolean prime(int val){
        if(val<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(val);i++){
            if(val % i ==0){
                return false;
            }
        }
        return true;
    }
}
