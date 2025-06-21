package com.bit;

public class Super_Reduced {
    public static void main(String[] args) {
        String line = "eabaabcabaabacde";
        line = line+" ";
        StringBuilder sb = new StringBuilder(line);
        int i =0;

        while(i<sb.length()-1){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);

            }
            i++;
        }
        System.out.println(sb);

    }
}
