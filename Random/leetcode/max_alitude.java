package com.leetcode;

public class max_alitude {
    public static void main(String[] args) {
            int[]gain ={52,-91,72};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int current_altidude = 0;
        int max_altidude =0;
        for(int g : gain){
            current_altidude+=g;
            max_altidude=Math.max(max_altidude,current_altidude);
        }
        return max_altidude;
    }
}
