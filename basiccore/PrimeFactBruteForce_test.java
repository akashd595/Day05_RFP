package com.bridgelabz.day05;

import java.util.Scanner;

public class PrimeFactBruteForce_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();

        int temp = num;
        for (int i=2; i*i<=temp; i++){
            while(num%i == 0){
                System.out.println(i);
                num = num/i;
            }
        }
    }
}
