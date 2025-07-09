package com.binary_search;

public class rotation_count {
    public static void main(String[] args) {

    }
    public static int count(int[]arr){
        int pivot = pivot(arr);
        return pivot+1;
    }
    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Pivot condition
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: Pivot condition
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Duplicates on both ends
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, go right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
