package com.bit;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toggle(n));
    }
    public static int toggle(int n){
        int num = Integer.toBinaryString(n).length();
        int mask = (1<<num)-1;
        return n^mask;
    }
}
