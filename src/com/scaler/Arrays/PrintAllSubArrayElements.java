package com.scaler.Arrays;

public class PrintAllSubArrayElements {
    public static void main(String[] args) {
        int[] A = {5, 3, 4, 2, 1};
        int N = A.length;
        for (int i = 0; i < N; i++) {
            //j starts exactly at ith index in a sub array
            //ex:[0,0],[0,1],[1,1]
            for (int j = i; j < N; j++) {
                //now every subarray is from i to j
                //print all subarray elements
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
