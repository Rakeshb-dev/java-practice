package com.leetcode;

public class Solution {
    public static void main(String[] args) {
        String[][] value = {
                {"phone","blue","pixel"},
                {"computer","silver","iphone"},
                {"phone","gold","iphone"}
        };
        String ruleKey="type";
        String ruleValue="phone";
        System.out.println(countMatches(value,ruleKey,ruleValue));

    }
    public static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int count =0;
        for(int i =0;i<items.length;i++){
            for(int j =0;j<items[i].length;j++){
                if(ruleValue == items[i][j]){
                    count++;
                }
            }

        }
        return count;
    }
}
