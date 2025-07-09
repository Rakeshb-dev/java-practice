package com.first_java;

import java.util.Scanner;

public class USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in INR = ");
        float inr = sc.nextFloat();
        System.out.print("Enter the Exchange Rate 1 usd = ");
        float eXchange_rate=sc.nextFloat();

        float usd= inr/eXchange_rate;
        System.out.printf("Amount in USD = $%.2f",usd);
    }
}