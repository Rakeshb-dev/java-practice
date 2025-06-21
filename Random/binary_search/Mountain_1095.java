package com.binary_search;

public class Mountain_1095 {
    public static void main(String[] args) {
        int [] arr={0,1,2,4,2,1};
        int target = 3;
        System.out.println(findInMountainArray(arr,target));
    }


        public static int findInMountainArray(int [] mountainArr , int target) {
            int peak = peak(mountainArr);
            int firstTry =diagnostic(mountainArr,target,0,peak);
            if(firstTry != -1){
                return firstTry;
            }
            return diagnostic(mountainArr,target,(peak+1),mountainArr.length-1);
        }
        public static int peak(int[] arr){
            int  start =0;
            int end = arr.length -1;
            while(start<end){
                int mid = start +(end-start)/2;
                if(arr[mid]>arr[mid +1]){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
            }
            return start;
        }
        public static int diagnostic(int[] arr,int target,int start,int end){

            while (start<=end){
                int mid = start +(end-start)/2;
                if(target == arr[mid]){
                    return mid;
                }
                boolean diagnostic = arr[start]<arr[end];
                if(diagnostic){
                    if(target<arr[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid +1;
                    }
                }
                else{
                    if(target>arr[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid +1;
                    }
                }
            }
            return -1;
            }
        }


