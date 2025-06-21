package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][3];
        for (int row= 0; row< arr.length;row++){
            for(int j =0;j<arr[row].length;j++) {
                arr[row][j] = sc.next();
            }
        }
        for (int row= 0; row< arr.length;row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
