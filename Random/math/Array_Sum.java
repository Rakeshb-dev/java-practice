package com.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_Sum {
    public static void main(String[] args) {
        int[] arr ={1,2,0,0};
        int k=24;

        System.out.print(addToArrayForm(arr,k));
    }
        public static List<Integer> addToArrayForm(int[] num, int k) {
            LinkedList<Integer> result = new LinkedList<>();
            int i = num.length - 1;

            while (i >= 0 || k > 0) {
                if (i >= 0) {
                    k += num[i];
                    i--;
                }

                result.addFirst(k % 10); // Get last digit
                k /= 10;                 // Remove last digit
            }

            return result;
        }
    }
//    public static int (int[] arr){
//        int sum =0;
//        for (int j : arr) {
//            sum += j;
//        }
//        return sum;
//    }

