package com.bridgelabz.day05;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number ");
        int num1 = sc.nextInt();
        System.out.println("Second number");
        int num2 = sc.nextInt();
        System.out.println("Third number ");
        int num3 = sc.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("first number is greatest "+num1);
            }else {
                System.out.println("third number is the greatest"+num3);
            }
        }else {
            if(num2>num3){
                System.out.println("second number is the greatest "+num2);
            }else {
                System.out.println("third number is the greatest "+num3);
            }
        }
    }
}
