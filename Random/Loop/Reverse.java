package com.Loop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String to be Reversed");
        String from = sc.next();
        StringBuilder sd =new StringBuilder(from);
        StringBuilder reversed = sd.reverse();
        System.out.println(reversed);
    }
}
