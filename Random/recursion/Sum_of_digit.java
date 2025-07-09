package com.recursion;

public class Sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10)+n%10;
    }
}
