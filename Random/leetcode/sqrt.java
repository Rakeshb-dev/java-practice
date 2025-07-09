package com.leetcode;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(answer(x));

    }
    public static int answer(int x){
        double ans = Math.sqrt(x);
        int anss = (int) ans;
        return anss;
    }
}
