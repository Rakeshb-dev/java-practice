package com.recursion;

import java.util.Scanner;

import static com.recursion.GCD.gcd;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println(lcm(a, b));
    }

    // Function to calculate LCM using the relation: LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /*
     * Time Complexity:
     * - Depends on GCD(a, b) function.
     * - If GCD is calculated using the Euclidean algorithm, its time complexity is O(log(min(a, b))).
     * - Multiplication and division are constant time, so:
     *   => Overall Time Complexity: O(log(min(a, b)))

     * Space Complexity:
     * - Uses only primitive variables and one method call.
     *   => Overall Space Complexity: O(1)
     */
}
