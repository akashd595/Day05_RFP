package com.bridgelabz.day05;

import java.util.Scanner;

public class DistanceFunc {
    static void root(int x, int y){
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance is "+distance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        System.out.println("Enter y ");
        int y = sc.nextInt();

        root(x, y);
    }
}
