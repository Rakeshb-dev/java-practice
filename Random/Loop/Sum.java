package com.Loop;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valNeg = 0;
        int valPos = 0;
        int valOdd = 0;
        System.out.print("Enter a number (zero to stop) : ");
        while (true) {

            int values = sc.nextInt();
            if (values == 0) {
                break;
            } else if (values > 0 && values % 2 == 0) {
                valPos += values;
            } else if (values > 0 && values % 2 != 0) {
                valOdd += values;
            }
            else{
                    valNeg += values;
                }
            }
        System.out.println("Sum of Negative numbers = " + valNeg);
        System.out.println("Sum of Positive even number = " + valPos);
        System.out.println("Sum of Positive odd number = " + valOdd);
        }
    }

