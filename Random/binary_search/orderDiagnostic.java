package com.binary_search;

import java.util.Scanner;

public class orderDiagnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] num = new int[a];
        for (int i = 0; i < a; i++) {
            num[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(order_diagnostic(num,target));
    }
    static int order_diagnostic(int[] num,int target){
        int start = 0;
        int end = num.length-1;

        while (start<=end){
            int mid = start +(end-start)/2;
            if(target == num[mid]){
                return mid;
            }
            boolean diagnostic = num[start]<num[end];
            if(diagnostic){
                if(target<num[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(target>num[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
