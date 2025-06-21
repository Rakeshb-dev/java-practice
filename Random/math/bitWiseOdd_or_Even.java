package com.math;

import java.util.Scanner;

public class bitWiseOdd_or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if((a&1)==1){
            System.out.println("The given number is odd ");
        }
        else{
            System.out.println("The given number is even");
        }

    }
}
