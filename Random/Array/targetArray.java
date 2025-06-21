package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetArray {
    public static void main(String[] args) {
      int[] nums ={0,1,2,3,4};
      int[] index ={0,1,2,2,1};
      System.out.print(Arrays.toString( createTargetArray(nums,index)));
    }

        public static int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> anss = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                anss.add(index[i],nums[i]);
            }
            int[] ans = new int[nums.length];
            for(int i =0;i<nums.length;i++){
                ans[i] = anss.get(i);
            }

            return ans;
        }

}
