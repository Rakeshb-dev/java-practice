package com.recursion;

import java.util.Scanner;

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        check(start,end);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(checkPrime(n)+checkPrime(m));
    }
    public static int checkPrime(int n){
        int count =0;
        int i =1;
        while(true){
            if(prime(i)){
                count++;
                if(n==count){
                    return i;
                }
            }
            i++;
        }
    }
    public static void check(int start ,int end){
        for(int i =start;i<=end;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
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
