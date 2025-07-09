package com.function;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value");
        int a = sc.nextInt();
        System.out.print("Enter the second value");
        int b = sc.nextInt();
        System.out.print("Enter the third value");
        int c = sc.nextInt();
        if(check(a,b,c)){
            System.out.println("Is a Pythagorean triplet");
        }
        else{
            System.out.println("Is not a Pythagorean triplet");
        }
    }
    public static boolean check(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        return x * x == y * y + z * z;
    }
}
