package com.bit;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int power =6;
Integer sc = 5;

        int ans = 1;
        ans =2;

        String s = "Abc";
        s = "BCA";

        System.out.println(s);

        while(power > 0){
            if((power&1)==1){
                   ans*=base;
            }

            base *= base;
            power = power >> 1;

        }
        System.out.println(ans);
    }

}
