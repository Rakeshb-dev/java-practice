package com.binary_search;

import java.util.Arrays;

public class google_question {
    public static void main(String[] args) {
     int[] arr ={7,2,5,10,8};
     int k =2;
        System.out.println((splitArray(arr,k)));
    }
    public static int splitArray(int[] nums, int k) {
        int start =0;
        int end =0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start<end){
            int mid = start + (end-start)/2;
            int sum =0;
            int peices =1;
            for(int num : nums){
                if(sum+num >mid){
                    sum = num;
                    peices ++;
                }
                else{
                    sum +=num;
                }
            }
            if(peices>k){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
