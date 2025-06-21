package com.first_java;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle ");
        float p = sc.nextFloat();
        System.out.print("Enter the Time ");
        float t = sc.nextFloat();
        System.out.print ("Enter the Rate of Interest ");
        float r = sc.nextFloat();

        float si = (p*t*r)/100;

        System.out.printf("Simple interest = %.2f", si);


    }
}
