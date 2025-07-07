package com.Loop;

public class Caser_Cipher {
    public static void main(String[] args) {
        String ans = " abcd  Hello";
        int a = 2;
        System.out.println(caser(ans,a));
    }
    public static String caser(String s,int a){
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=' ') {
                sb.append((char) (s.charAt(i) + a));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
