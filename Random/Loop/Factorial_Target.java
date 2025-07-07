package com.Loop;

import java.util.Scanner;

public class Factorial_Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(check(num,target));
    }

    private static int check(int num, int target) {
        if(target ==1){
            return num;
        }

        int i = num/2;
        int count =1;
        while(i>=0){
            if(num%i==0){
                count++;
            }
            if(target==count){
                return i;
            }
            i--;
        }
        return 1;
    }
}
