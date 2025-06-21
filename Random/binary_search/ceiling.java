package com.binary_search;

import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
       int a = sc.nextInt();
       int [] num = new int[a];

        System.out.print("Enter the values : ");
        for (int i = 0; i < a; i++) {
            num[i] =sc.nextInt();
        }
        System.out.print("Enter the Target : ");

        int target = sc.nextInt();
        System.out.println(binarysearch(num,target));
    }
    public static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start +(end-start)/2;



            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }


        }
        return start;
    }
}
