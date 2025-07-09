package com.recursion;

import java.util.*;

public class Sieve{

    public static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // initially assume all numbers are prime

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 30; // example
        sieve(n);
    }
}


    /*
     * Time Complexity:
     * - Outer loop runs from 2 to sqrt(n), and inner loop marks multiples.
     * - The total work done is approximately: O(n log log n)
     *   => Overall Time Complexity: O(n log log n)
     *
     * Space Complexity:
     * - Uses a boolean array of size n+1
     *   => Overall Space Complexity: O(n)
     */

