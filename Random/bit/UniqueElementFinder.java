package com.bit;

public class UniqueElementFinder {
    public static int findUnique(int[] nums) {
        int result = 0;

        // Loop through all 32 bits
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;

            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    bitCount++;
                }
            }

            // If count of 1s at ith bit is not divisible by 3, set that bit in result
            if (bitCount % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        System.out.println("Unique number: " + findUnique(nums)); // Output: 3
    }
}

