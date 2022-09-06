package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] input = {7, 4, -1, -4, 2, 6, -7, 3};
        MaxSumOfSubArray max = new MaxSumOfSubArray();
        int B = 3;
        int res = max.maxSum(input, B);
        System.out.println(res);
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            inputList.add(input[i]);
        }
        int res2 = max.maxSumInList(inputList, B);
        System.out.println(res2);
    }

    //Finding sum of all sub arrays of fixed length B.
    //Then comparing with max and return max
    public int maxSum(int[] A, int B) {
        int max = Integer.MIN_VALUE;
        int N = A.length;
        for (int i = 0; i < N - B; i++) {
            int j = i + B - 1;
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum = sum + A[k];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    //Finding sum of all sub array of fixed length B.
    //Then comparing with max and return max
    //Using Array List
    public int maxSumInList(List<Integer> A, int B) {
        int N = A.size();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N - B; i++) {
            int j = i + B - 1;
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum = sum + A.get(k);
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
