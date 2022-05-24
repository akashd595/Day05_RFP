package com.bridgelabz.day05;

import java.util.Scanner;

public class ComputeQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Enter the diviser ");
        int dv = sc.nextInt();
        int rem = num%dv; ;
        int quotient=num/dv;
        System.out.println("Quotient : "+quotient);
        System.out.println("Remember : "+rem);

    }
}
