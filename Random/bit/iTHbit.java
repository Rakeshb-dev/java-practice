package com.bit;

import java.util.Scanner;

public class iTHbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.print((n&(1<<k-1))==0?0:1);
    }
}
