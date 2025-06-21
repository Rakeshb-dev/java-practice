package com.recursion;

public class PowerFunction {

    // Function to compute x^n using recursion
    public static int power(int x, int n) {
        // Base case
        if (n == 0)
            return 1;

        // Recursive call: halve the exponent
        int tmp = power(x, n / 2);

        // Square the result
        tmp = tmp * tmp;

        // If n is even, return squared result
        if (n % 2 == 0)
            return tmp;
        else
            // If n is odd, multiply one more x
            return tmp * x;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println("Result: " + power(x, n)); // Output: 1024
    }
}
