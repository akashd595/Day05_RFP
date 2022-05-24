package com.bridgelabz.day05;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("Please enter the power ");
        Scanner sc = new Scanner(System.in);
        int powerOf = sc.nextInt();
        int result = 1;
        for(int i=1; i<=powerOf; i++){
            result *= 2;
            System.out.println("2 ^"+i+" = "+result);
        }
    }
}
