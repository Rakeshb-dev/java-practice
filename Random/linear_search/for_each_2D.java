package com.linear_search;

import java.util.Scanner;

public class for_each_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j =0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }

        }
       // int[][] arr = new int[rows][cols];
        System.out.print("The maximum number is " + max(arr));
    }
    public static int max (int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }

            }
        }
        return max;
    }
}
