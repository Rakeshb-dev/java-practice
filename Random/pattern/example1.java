package com.pattern;

import java.util.*;
public class example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>10000){
            System.out.print(a+2000);
        }
        else{
            System.out.println(a+1000);
        }
    }
}
