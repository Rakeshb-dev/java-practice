package com.binary_search;

public class rotated_array {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 5;
        System.out.println(search(nums,target ));
    }

        public static int search(int[] nums, int target) {
            int pivot = pivot(nums);
            if(pivot == -1){
                return  binary(nums , target , 0 ,nums.length -1);
            }
            if(target==nums[pivot]){
                return pivot;
            }
            if (target >= nums[0]){
                return binary(nums , target , 0 ,pivot -1 );
            }
            return binary(nums , target , pivot +1 ,nums.length -1);
        }
        public static int pivot (int[] arr){
            int start = 0;
            int end = arr.length -1;
            while(start<end){
                int mid = start + (end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid > start && arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                if(arr[mid]<=arr[start]){
                    end= mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return -1;
        }
       public static int binary(int[]nums,int target,int start,int end){
            while(start<=end){
                int mid = start + (end - start)/2;
                if(target < nums[mid]){
                    end = mid-1;
                }
                else if (target > nums[mid]){
                    start =mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    }

