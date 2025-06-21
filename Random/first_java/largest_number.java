package com.first_java;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is greater");
        }
        else if (b>a) {
            System.out.println("B is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
