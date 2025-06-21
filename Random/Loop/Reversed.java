package com.Loop;

import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to be Reversed : ");
        String value = sc.next();
        String reversed = "";

        for(int i = value.length() - 1;i>=0;i--){
            reversed += value.charAt(i);
        }
        System.out.println(reversed);
    }
}
