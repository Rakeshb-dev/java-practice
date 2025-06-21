package com.bit;

public class CountBit {
    public static void main(String[] args){
        System.out.print(countSetBits(15));
    }
        public static int countSetBits(int n) {
            if (n == 0)
                return 0;

            int x = largestPowerOf2(n); // Find the highest power of 2 ≤ n
            int bitsUpTo2PowX = x * (1 << (x - 1)); // x * 2^(x-1)
            int msbBits = n - (1 << x) + 1; // MSB bits in remaining numbers
            int rest = n - (1 << x); // Remaining part

            return bitsUpTo2PowX + msbBits + countSetBits(rest);
        }

        private static int largestPowerOf2(int n) {
            int x = 0;
            while ((1 << x) <= n) {
                x++;
            }
            return x - 1;
        }
}
