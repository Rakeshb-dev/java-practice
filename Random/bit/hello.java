package com.bit;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = Integer.parseInt(num);
        count(n);

    }
    public static void count(int n){
        String[] arr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
       StringBuilder sb = new StringBuilder();
        while(n>0){
            int x = n%10;
            int count =1;
            n/=10;
            while(x==(n%10)){
                count++;
                n/=10;
            }
            switch (count){
                case 1:
                    sb.insert(0,arr[x]);
                    break;
                case 2:
                    sb.insert(0,arr[x]);
                    sb.insert(0," double ");
                    break;
                case 3:
                    sb.insert(0,arr[x]);
                    sb.insert(0," triple ");
                    break;
                case 4:
                    sb.insert(0,arr[x]);
                    sb.insert(0," double double ");
                    break;
                case 5:
                    sb.insert(0,arr[x]);
                    sb.insert(0," triple double ");
                    break;
                case 6:
                    sb.insert(0,arr[x]);
                    sb.insert(0," triple triple ");
                    break;
            }

        }
        System.out.print(sb);
    }
}
