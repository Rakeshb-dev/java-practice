package com.pattern;

import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            for(int j =1;j<=i;j++){
               System.out.print("*");
            }
            int space =2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
           
        }
        System.out.println();


        
        sc.close();
    }
    for(int i = 1;i<=n;i++){
        for(int j =1;j<=i;j++){
           System.out.print("*");
        }
        int space =2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int k =1;k<=i;k++){
            System.out.print("*");
       
    }
    System.out.println();
}
}
}