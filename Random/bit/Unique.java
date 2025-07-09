package com.bit;

public class Unique {
    public static void main(String[] args) {
        int[] arr={4,1,2,2,1,2,};
        System.out.println(unique(arr));
    }
    public static int unique(int[] arr){
        int xor=0;
        for (int j : arr) {
            xor ^= j;
        }
        return xor;
    }
}
