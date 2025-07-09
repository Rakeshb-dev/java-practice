package com.Loop;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a letter to find whether it is vowel or consonant : ");
        char ch = sc.next().charAt(0);
        ch= Character.toLowerCase(ch);
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            System.out.println("The given letter is a Vowel");
        }
        else{
            System.out.println("The given letter is a Consonant");
        }

    }
}
