package com.recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }

    // Recursive function to compute GCD using the Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    /*
     * Time Complexity:
     * - The Euclidean algorithm reduces the problem size logarithmically.
     * - Therefore, the time complexity is: O(log(min(a, b)))

     * Space Complexity:
     * - Each recursive call adds a new stack frame.
     * - In the worst case, there are O(log(min(a, b))) recursive calls.
     *   => Overall Space Complexity: O(log(min(a, b)))
     */
}
