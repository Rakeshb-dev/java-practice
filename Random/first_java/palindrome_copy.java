package com.first_java;

import java.util.Scanner;

public class palindrome_copy {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;  // Negative numbers can't be palindromes

        int reversed = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println("✅ The given number is a Palindrome.");
        } else {
            System.out.println("❌ The given number is Not a Palindrome.");
        }
    }
}
