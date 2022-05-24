package com.bridgelabz.day05;
import java.util.Scanner;

public class TripletFunc {
    static void triplets(int[] arr, int n)
    {
        int count=0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count+" triplets found");
    }
    public static void main(String[] args) {
        {

            System.out.println("Enter array size ");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            triplets(arr, size);

        }
    }
}
