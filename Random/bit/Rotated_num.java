package com.bit;

import java.util.Scanner;

public class Rotated_num {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(rotate(45371,8));

    }
    public static int rotate(int n , int k){
        int temp =n;
        int count = count(n);
            int digit= temp/(int)Math.pow(10,count-k);
            int newval = temp%(int)Math.pow(10,count-k);
            temp= newval*(int)Math.pow(10,k)+ digit;

        return temp;
    }
    public static int count(int n){
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}
