package com.linear_search;

import java.util.Scanner;

public class even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of arr : ");
        int a = sc.nextInt();
        int[]nums =new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(find(nums));
    }
    public static int find(int[] nums){
        int count = 0;
        for(int num :nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {

             int counts = check(num);

             return counts%2==0;
         }

         static int check(int num){
         int counts =0;
        while (num > 0) {
                 num /= 10;
                 counts++;
             }
        return counts;
         }


}
