package com.recursion;

import java.util.Scanner;

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }

    // Function to check if a number is prime
    public static boolean prime(int val) {
        if (val == 1) {
            return false;
        }
        if (val == 2 || val == 3) {
            return true;
        }
        if (val % 2 == 0 || val % 3 == 0) {
            return false;
        }

        // Only check up to sqrt(val), using 6k ± 1 optimization
        for (int i = 5; i * i <= val; i += 6) {
            if (val % i == 0 || val % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Time Complexity:
     * - We check divisibility up to sqrt(n), skipping even numbers and multiples of 3.
     * - So time complexity is O(sqrt(n)).

     * Space Complexity:
     * - Only uses primitive variables; no recursion or data structures.
     *   => Space Complexity is O(1)
     */
}
