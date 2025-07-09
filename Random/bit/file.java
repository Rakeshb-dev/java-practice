package com.bit;

public class file {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 701;
        while(n>0) {
            n--;
            int val = n % 26;
            sb.insert(0, (char) ('A' + val));
            n /= 26;
        }
        System.out.println(sb);
    }
}