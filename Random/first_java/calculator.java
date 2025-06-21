package com.first_java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter any operator '+' ,'-','*','/','%'");
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println(a+b);
        }
        else if(ch == '-'){
            System.out.println(a-b);
        }
        else if(ch == '*') {
            System.out.println(a * b);
        }
        else if(ch == '/') {
            System.out.println(a / b);
        }
        else if(ch == '%') {
            System.out.println(a % b);
        }
        else {
            System.out.println("Enter a correct operator");
        }
    }
}
