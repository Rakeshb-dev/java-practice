package com.Loop;

import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF of the given values is : "+ HCF(a,b));
        System.out.println("LCM of the given values is : " + LCM(a,b));

    }
    public static int HCF(int a , int b){

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a , int b){
        return ((a*b)/HCF(a, b));
    }
}
