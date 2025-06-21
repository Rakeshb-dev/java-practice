package com.Loop;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The the first coordinates");
        System.out.print("Enter the first point : ");
        int x1= sc.nextInt();
        System.out.print("Enter the second point : ");
        int x2= sc.nextInt();

        System.out.println("The the second coordinates");
        System.out.print("Enter the first point : ");
        int y1= sc.nextInt();
        System.out.print("Enter the second point : ");
        int y2= sc.nextInt();

       double initial = Math.pow((x2-x1),2 ) ;
        double fina = Math.pow((y2-y1),2 ) ;
        double total = initial+fina;


        System.out.println("The total distance is " + (Math.sqrt(total)));

    }
}
