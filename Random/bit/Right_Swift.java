package com.bit;

import java.util.Scanner;

public class Right_Swift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int swift = sc.nextInt();
        System.out.println(num>>swift);
    }
}
