package com.Demo;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            }
        int hcf = a;
        System.out.println(hcf);
    }
}
