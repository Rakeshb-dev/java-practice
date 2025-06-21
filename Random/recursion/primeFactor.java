package com.recursion;

import java.util.Scanner;

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)
public class primeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        primefactor(n);
    }

    // Function to print all prime factors of n
    public static void primefactor(int n) {
        if (n <= 1) {
            return;
        }

        // Divide by 2 repeatedly
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // Divide by 3 repeatedly
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n / 3;
        }

        // Check for factors of the form 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n = n / (i + 2);
            }
        }

        // If n is still greater than 3, then n itself is prime
        if (n > 3) {
            System.out.print(n);
        }
    }

    /*
     * Time Complexity:
     * - We try dividing n by possible prime factors up to sqrt(n).
     * - Thus, the time complexity is O(sqrt(n)).

     * Space Complexity:
     * - No recursion, no extra data structures.
     * - Only a few variables used.
     *   => Space Complexity is O(1)
     */
}
