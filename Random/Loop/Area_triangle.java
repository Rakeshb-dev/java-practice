package com.Loop;

import java.util.Scanner;

public class Area_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height ");
        int H = sc.nextInt();
        System.out.println("Enter the Base");
        int B = sc.nextInt();
        double Area = (0.5*H*B);
        System.out.printf("The Area of Triangle %.2f",Area);
    }
}
