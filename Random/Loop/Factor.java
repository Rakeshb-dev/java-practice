package com.Loop;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();
        System.out.print("The factorial are ");
        for(int i= 1;i<=num;i++){
            if(num % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}
