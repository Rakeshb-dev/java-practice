package com.Array;

import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        int[] num={2,7,4};
        int k =181;
        System.out.println(addToArrayForm( num, k));
    }

        public static List<Integer> addToArrayForm(int[] num, int k) {
            LinkedList<Integer> result = new LinkedList<>();
            int i = num.length - 1;

            while (i >= 0 || k > 0) {
                if (i >= 0) {
                    k += num[i];
                    i--;
                }

                result.addFirst(k % 10); // Get last digit
                k /= 10;                 // Remove last digit
            }

            return result;
        }
    }


