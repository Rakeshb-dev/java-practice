package com.pattern;

import java.util.Scanner;
public class FirstClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a=scan.nextInt();
        int temp=a;
        for(int i =1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }

            for(int k=1;k<=temp;k++){
            System.out.print(" * ");
            
            }
            temp--;
            System.out.println();
        }

        
    }
}
