package com.Loop;

import java.util.Scanner;

public class Average_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.print("Enter the number of values : ");
        int value = sc.nextInt();
        for(int i=0;i<value;i++){
            int valueS = sc.nextInt();
            total += valueS;
        }
        System.out.println("The average of N values is " + (total/value));
    }
}
