package com.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.print(sumOfDigits(99999));
    }
    public static int sumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
}
