package com.aishwaryaK;

import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //finding for n number of series
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        //while loop
        while(count<=n)
        {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
