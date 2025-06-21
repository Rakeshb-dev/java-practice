package com.leetcode;

public class missing_count {
    public static void main(String[] args) {
        int[] num = {2,3,4,7,11};
        int target = 5;
        System.out.println(answer(num,target));

    }
    public static int answer(int []num,int index){
        int start = 0;
        int end = num.length-1;

        while(start<=end){
            int mid = start + ((end-start)/2);
            int count = num[mid] -(mid +1);

            if(count < index){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return index+start;
    }
}
