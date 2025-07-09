package com.Loop;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius ");
        int R = sc.nextInt();
        double Area = (Math.PI * R *R);
        System.out.printf("The Area of Circle %.2f",Area);
    }
}
