package com.Array;

import java.util.ArrayList;
import java.util.Arrays;


public class Insert {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,8};
        int sizeOfArray = arr.length;
        int index =4;
        int element = 80;
        System.out.println(insertAtIndex(arr,sizeOfArray,index,element));
    }

    public static ArrayList insertAtIndex(int[] arr, int sizeOfArray, int index, int element) {
        ArrayList<Integer> ar = new ArrayList<>();
        Arrays.sort(arr);
        for (int num : arr) {
            ar.add(num);
        }
        ar.add(index, element);
        return ar;
    }



}