package com.bit;

import java.util.Scanner;

public class bye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num =sc.nextLine();
        count(num);
    }
    public static void count(String n){
        String[] arr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int count =1;
        for(int i = 0;i<n.length();i++){
            if(n.charAt(i)==n.charAt(i+1))
                count++;
            else if(count==2){
                System.out.println("Double " + arr[n.charAt(i)-48]);
            }
            else if(count==3){
                System.out.println("Triple " + arr[n.charAt(i)-48]);
            }
            else if(count==4){
                System.out.println("Double Double " + arr[n.charAt(i)-48]);
            }
            else if(count==5){
                System.out.println("Triple Double " + arr[n.charAt(i)-48]);
            }
            else if(count==6){
                System.out.println("Triple Triple " + arr[n.charAt(i)-48]);
            }


        }
    }
}
