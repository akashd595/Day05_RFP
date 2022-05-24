package com.bridgelabz.day05;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class QuadraticFun {
    static void delta(int a, int b, int c){
        double delta = Math.pow(b, 2) - 4*a*c;
        double root1 = ((-1)*b + Math.sqrt(delta))/(2*a);
        double root2 = ((-1)*b - Math.sqrt(delta))/(2*a);

        System.out.println("Root1 is "+root1);
        System.out.println("Root2 is "+root2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        delta(a, b, c);
    }
}
