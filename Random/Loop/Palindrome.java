package com.Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        System.out.print("Enter a string: ");
        String b = sc.nextLine();

        if (isPalindrome(a)) {
            System.out.println(a + " is a palindrome number.");
        } else {
            System.out.println(a + " is not a palindrome number.");
        }

        if (isPalindrome(b)) {
            System.out.println("\"" + b + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + b + "\" is not a palindrome string.");
        }
    }

    public static boolean isPalindrome(String value) {
        String reversed = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            reversed += value.charAt(i);
        }
        return reversed.equals(value);
    }

    public static boolean isPalindrome(int value) {
        int reversed = 0;
        int original = value;
        while (value > 0) {
            int digit = value % 10;
            reversed = reversed * 10 + digit;
            value /= 10;
        }
        return reversed == original;
    }
}
