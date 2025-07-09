package com.oop;

import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line= sc.nextLine();
        StringBuilder builder = new StringBuilder(line);
        String reversed = builder.reverse().toString();
        if(line.equals(reversed)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
