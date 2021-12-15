package com.aishwaryaK;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();
         //Find the largest of 2 numbers
         int max = a;
         if (max< b){
             max = b;
         }
         if(max < c){
             max = c;
         }
        System.out.println(max);

    }
}
