package com.bridgelabz.day05;

import java.util.Scanner;

public class LeapYear_Day5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year ");
        int year = sc.nextInt();

        if(year < 1000 || year > 9999){
            System.out.println("please enter a four digit year");
        }
        else {
            if(year%400 == 0){
                System.out.println("Leap year ");
            } else if (year%100 == 0 || year%4 != 0) {
                System.out.println("Not a Leap year ");
            }
            else {
                System.out.println("leap year __");
            }
        }
    }
}
