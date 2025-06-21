package com.function;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle");
        int R = sc.nextInt();
        System.out.println("The area of the circle is " + area(R));
        System.out.println("The Circumference of the circle is " + circumference(R));

    }
    public static double area(int R) {
        return (Math.PI*R*R);
    }
    public static double circumference(int R) {
        return (2*Math.PI*R);
    }
}
