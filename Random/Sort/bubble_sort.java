package com.Sort;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr ={1,9,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(search(arr)));

    }
    public static int[] search (int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = false;
            for(int j =1;j< arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;

                }
            }
            if(!swap){
                break;
            }

        }
        return arr;
    }
}
