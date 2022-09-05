package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContiguousSubArray {

    public static void main(String[] args) {
        MaxSumContiguousSubArray maximum = new MaxSumContiguousSubArray();
        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(2);
        input.add(3);
        input.add(-2);
        input.add(-4);
        input.add(7);
        int result = maximum.maxSubArray1(input);
        int result2 = maximum.maxSubArray2(input);
        System.out.println(result);
        System.out.println(result2);
    }

    //time complexity O(N*N)
    public int maxSubArray1(final List<Integer> A) {
        int N = A.size();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            //j starts exactly at i for sub array
            for (int j = i; j < N; j++) {
                sum = sum + A.get(j);
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //time complexity O(N)
    //preferred in interviews
    public int maxSubArray2(final List<Integer> A) {
        int N = A.size();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + A.get(i);
            if (max < sum) {
                max = sum;
            }
            //Discarding the negative numbers because it will give minimum result
            //So making the sum as zero, so the next time we will get positive number
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
