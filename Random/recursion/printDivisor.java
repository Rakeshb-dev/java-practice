package com.recursion;

import java.util.Scanner;

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)
public class printDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        divisor(n);
    }

    // Function to print all divisors of n in sorted order
    public static void divisor(int n) {
        int i;

        // Print smaller divisors (i)
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Print corresponding larger divisors (n/i) in reverse order
        for (i = i - 1; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {  // Avoid printing sqrt(n) twice
                System.out.print((n / i) + " ");
            }
        }
    }

    /*
     * Time Complexity:
     * - We iterate from 1 to sqrt(n) twice.
     * - So time complexity is O(sqrt(n)).

     * Space Complexity:
     * - Only primitive variables used, no recursion or extra structures.
     *   => Space Complexity is O(1)
     */
}
