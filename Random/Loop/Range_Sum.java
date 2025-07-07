package com.Loop;

import java.util.Scanner;

public class Range_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<a;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            check(start,end,arr);
        }
    }
    public static void check(int start , int end,int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >=start && arr[i]<=end ){
                count++;
            }
        }
        System.out.print(count + " ");
    }
}
