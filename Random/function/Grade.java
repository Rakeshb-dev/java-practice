package com.function;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark 100 or below 100 ");
        int mark = sc.nextInt();
        System.out.println("The grade for your mark is " + mark(mark));

    }
    public static String mark(int mark){
        if(mark>100 || mark<0){
            return "Enter a value of 100 or below";
        }
        else if(mark>=91){
            return "AA";
        }
        else if(mark>=81){
            return "AB";
        }
        else if(mark>=71){
            return "BB";
        }
        else if(mark>=61){
            return "BC";
        }
        else if(mark>=51){
            return "CD";
        }
        else if(mark>=41){
            return "DD";
        }
        else{
            return "Fail";
        }
    }
}


