package com.bit;

import java.util.Arrays;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i]=sc.nextInt();
        }
//        int sum = Arrays.stream(arr).sum();
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println(sum);
        System.out.println(sum/ arr.length);
    }
}
