package com.scaler.Arrays;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        //int[] inputArray = {5, 1, 2, 3, 6, 7, -1, -2, 9};
        int[] inputArray = {5, 1, 2, 3};
        SumOfAllSubArrays sumOfSub = new SumOfAllSubArrays();
        sumOfSub.sumOfSubArraysII(inputArray);
        System.out.println("");
        sumOfSub.sumOfSubArraysI(inputArray);
    }

    //O(N^3) - Time Complexity
    public void sumOfSubArraysI(int[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                System.out.print(sum + " ");
            }
        }
    }

    //Print All Sub Arrays Sum
    //Time Complexity is O(N*N)
    //Carry Forward Technique
    public void sumOfSubArraysII(int[] A) {
        int N = A.length;
        //Getting all sub arrays
        //j all starts at i for sub arrays
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A[j];
                System.out.print(sum + " ");
            }
        }
    }
}
