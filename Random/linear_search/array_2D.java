package com.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {12, 13, 54, 20, 19},
                {11, 9, 8, 7, 55, 96, 69},
                {22, 33, 44, 77}
        };
        int target = sc.nextInt();
        int[]  ans = find(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] find(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for(int j =0;j<arr[row].length;j++){
                if(arr[row][j]==target){

                    return new int[]{row,j};
                }
            }

        }
        return new int[]{-1};
    }
}