package com.math;

import java.util.Scanner;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3,2,2,3,1,4,5,4,5,7,6,7};


        System.out.println(two(arr));
    }
    public static int two(int[] arr){
        int unique = 0;

        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }
}
