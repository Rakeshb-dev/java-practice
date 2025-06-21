package com.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = sc.nextLine();
        System.out.println("Enter a target character");
        char target = sc.next().charAt(0);
        System.out.println(linear(line,target));
        System.out.println(Arrays.toString(line.toCharArray()));
    }
    public static boolean linear(String line , char target){
        if(target == 0){
            return false;
        }
        for(char ch : line.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
