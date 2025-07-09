package com.binary_search;

import java.util.Scanner;

public class count_trail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res =0;
        for (int i = 5; i <=n ; i*=5){
            res = res + n/i;
        }
        System.out.println(res);
    }
}
