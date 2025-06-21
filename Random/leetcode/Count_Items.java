package com.leetcode;

import java.util.List;

public class Count_Items {
    public static void main(String[] args) {


    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int index =0;
         if(ruleKey.equals("color")){
             index =1;
         }
         else if(ruleKey.equals("name")){
              index =2;
        }
         int count =0;
         for(List<String> item:items){
             if(item.get(index).equals(ruleValue)){
                 count++;
             }
         }
         return count;
    }
}
