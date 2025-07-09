package com.Loop;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product Price");
        int price = sc.nextInt();
        System.out.println("Enter the percentage without %");
        int percentage = sc.nextInt();
        System.out.println("The amount after discount = " + (price-((price*percentage)/100)));

    }
}
