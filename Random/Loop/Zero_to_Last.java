package com.Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Zero_to_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr(arr)));

    }
    public static int[] arr(int[] arr){
        int i =0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int i,int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
