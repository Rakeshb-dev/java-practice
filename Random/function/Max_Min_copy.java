package com.function;

import java.util.Scanner;

public class Max_Min_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The maximum value is " + Max(a, b, c));
        System.out.println("The minimum value is " + Min(a, b, c));
    }

    public static int Max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int Min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
