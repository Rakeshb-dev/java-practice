package com.Sort;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
         int[] arr ={1,9,2,3,4,5,6,7,8};
        
        System.out.println(Arrays.toString(selection(arr)));
    }
    public static int [] selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int maximum = max(arr,0,last);
            swap(arr,maximum,last);
        }
        return arr;
    }
    public static void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int max(int [] arr,int start,int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
