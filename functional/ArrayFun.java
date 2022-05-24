package com.bridgelabz.day05;

import java.util.Scanner;

public class ArrayFun {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("M ");
        int m = sc.nextInt();
        System.out.println("N");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.println("arr["+i+"]"+"["+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.println("arr["+i+"]"+"["+j+"] = "+arr[i][j]);
            }
        }
    }
}
