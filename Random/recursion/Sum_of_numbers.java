package com.recursion;

public class Sum_of_numbers {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int n){
       if(n==1){
           return +1;
       }
       return n+sum(n-1);
    }
}
