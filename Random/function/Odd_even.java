package com.function;

import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        int a = sc.nextInt();
        if(fun(a)){
            System.out.print("The give value is Even");
        }
        else{
            System.out.print("The give value is Odd");
        }
    }
    public static boolean fun(int a){
          return (a % 2 == 0);
    }
}
