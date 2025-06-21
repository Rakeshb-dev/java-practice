package com.function;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a >0){
            a /= 10;
            count++;
        }
        System.out.print(count);
    }
}
