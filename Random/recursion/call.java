package com.recursion;

public class call {
    public static void main(String[] args) {
        number(4);
    }
    public static void number(int n){

        if(n==0){
            return;
        }
        System.out.print(n);
        number(n-1);
    }
}
