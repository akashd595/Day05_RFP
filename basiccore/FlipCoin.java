package com.bridgelabz.day05;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Flip coin program");
        System.out.println("Enter number of times to flip the coin");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double headCount = 0;
        double tailCount = 0;
        int i=0;
        while( i<num){
            double outcome = Math.random();
            if(outcome > 0.5){
                headCount++;
            }else {
                tailCount++;
            }
            i++;
        }
        System.out.println("heads "+headCount);
        double headPercentage = (headCount/(headCount+tailCount) * 100);
        System.out.println("heads "+headPercentage+"%");
        System.out.println("tails "+tailCount);
        double tailPercentage = (tailCount/(headCount+tailCount) * 100);
        System.out.println("tails "+tailPercentage+"%");
    }
}
