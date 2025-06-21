package com.linear_search;

public class Rich_customer_1672 {
    public static void main(String[] args) {
        int[][] account = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(check(account));
    }

    private static int check(int[][] account) {
        int max=Integer.MIN_VALUE;
        int sum =0;

        for (int[] ints : account) {
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }

        return max;
    }

}
/*
        for(int row = 0;row<account.length;row++){
            for(int cols = 0 ;cols<account[row].length;cols++){
                sum = sum +account[row][cols];
            }
            if(max<sum){
                max=sum;
            }
            sum =0;
        }

        return max;
 */

