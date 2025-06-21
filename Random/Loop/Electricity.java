package com.Loop;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();

        if(100>=units){
            System.out.print("The amount for " + units + " =  rs." +  (1.5 * units) );
        }
        else if(200 >= units){
            int hun = units%100;
            double total = (hun*2) + (100*1.5);
            System.out.print("The amount for " + units + " =  rs." + total );
        }
        else if(300 >= units){
            int remain = units%200;
            double total = (remain*3) + (100*1.5) + (100*2);
            System.out.print("The amount for " + units + " =  rs." +  total );
        }
        else{
            int remain = units%300;
            double total = (remain*5) + (100*1.5) + (100*2) + (100*3);
            System.out.print("The amount for " + units + " =  rs." +  total );

        }
    }
}
