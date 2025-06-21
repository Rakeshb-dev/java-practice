package com.Array;

public class SecondLargestFinder {
    public static int secondLargest(int[] arr) {
        int first = -1, second = -1;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
//        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
//        int[] arr3 = {10, 10, 10};

//        System.out.println(secondLargest(arr1)); // Output: 34
        System.out.println(secondLargest(arr2)); // Output: 5
//        System.out.println(secondLargest(arr3)); // Output: -1
    }
}
