package com.function;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(eligible(age)){
            System.out.println(name + " is eligible for voting.");
        }
        else{
            System.out.println(name + " is not eligible for voting.");
        }
    }
    public static boolean eligible(int age){
        return (age>=18);
    }
}
