package com.Loop;

import java.util.Scanner;

public class ncr_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the N value : ");
        int N = sc.nextInt();
        System.out.println("Enter the R value : ");
        int R = sc.nextInt();
        if(R>N){
            System.out.print("Enter the correct values");
            return;
        }
        int r = factorial(R);
        int n = factorial(N);
        int a = factorial((N-R));

        System.out.println("The Value of Ncr = " + (n/(r*a)));
        System.out.println("The Value of Npr = " + (n/a));
    }
    public static int factorial(int N) {
        int Factorial = 1;
        for (int i = 1; i <= N; i++) {
            Factorial *= i;
        }
        return Factorial;
    }
}
