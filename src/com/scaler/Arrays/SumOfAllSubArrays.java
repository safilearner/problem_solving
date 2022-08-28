package com.scaler.Arrays;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] inputArray = {5, 1, 2, 3, 6, 7, -1, -2, 9};
        SumOfAllSubArrays sumOfSub = new SumOfAllSubArrays();
        sumOfSub.sumOfSubArrays(inputArray);
    }

    //Print All Sub Arrays Sum
    //Time Complexity is O(N*N)
    public void sumOfSubArrays(int[] A) {
        int N = A.length;
        //Getting all sub arrays
        //j all starts at i for sub arrays
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sum = sum + A[j];
                System.out.println(sum);
            }
        }
    }
}
