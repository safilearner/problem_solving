package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfFixedLength {

    public static void main(String[] args) {
        MaxSumOfFixedLength max = new MaxSumOfFixedLength();
        int[] input = {7, 4, -1, -4, 2, 6, -7, 3};
        int B = 3;
        int res = max.maxSumInArrayUsingSlidingWindow(input, B);
        System.out.println(res);

        List<Integer> inputList = new ArrayList<>();
        for (int j : input) {
            inputList.add(j);
        }
        int res2 = max.maxSumInArrayList(inputList, B);
        System.out.println(res2);
    }

    //Sliding Window
    public int maxSumInArrayUsingSlidingWindow(int[] A, int K) {
        int N = A.length;
        int sum = 0;
        //Edge Case for i = 0
        //In Sliding window, if we do A[i-1] it will throw index out of bound
        //So explicitly doing summation for i = 0
        for (int i = 0; i < K; i++) {
            sum = sum + A[i];
        }
        int max = sum;
        //Sliding window technique, TC:O(N)
        for (int i = 1; i < N; i++) {
            sum = sum + A[i] - A[i - 1];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    //sliding window can be used only when the size is fixed
    public int maxSumInArrayList(List<Integer> A, int K) {
        int N = A.size();
        int sum = 0;
        //For edge case
        for (int i = 0; i < K; i++) {
            sum = sum + A.get(i);
        }
        int max = sum;
        //sliding window TC: O(N)
        for (int i = 1; i < N; i++) {
            sum = sum + A.get(i) - A.get(i - 1);
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
