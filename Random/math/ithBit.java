package com.math;

public class ithBit {
    public static void main(String[] args) {
        int n =7;
        int i = 4;

        int mask = 1<<i-1;
        int result = n & mask;

        int bit = (result != 0) ?1:0;

        System.out.println(bit);


    }
}
