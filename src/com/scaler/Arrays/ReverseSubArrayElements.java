package com.scaler.Arrays;

import java.util.Scanner;

public class ReverseSubArrayElements {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        ReverseSubArrayElements rev;
        rev = new ReverseSubArrayElements();
        //Getting input from console
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[] resultArray = rev.reverseSubArray(inputArray, i, j);
        for (int X : resultArray) {
            System.out.print(X + " ");
        }
        sc.close();
    }

    //Sub Array is continuous part of array from left to right
    //Any continuous part of an array is sub array
    //Given elements from i to j, reverse the part
    public int[] reverseSubArray(int[] A, int i, int j) {
        while (i < j) {
            A[i] = A[i] ^ A[j];
            A[j] = A[j] ^ A[i];
            A[i] = A[i] ^ A[j];
            i++;
            j--;
        }
        return A;
    }
}
