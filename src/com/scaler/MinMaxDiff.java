package com.scaler;

public class MinMaxDiff {
    public static void main(String[] args) {
        int[] N = {5, 1, 2, 7, 8, 9, 6};
        MinMaxDiff minmax = new MinMaxDiff();
        int result = minmax.solve(N);
        System.out.println(result + " is the difference between two numbers");
    }

    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                if (max < A[i]) {
                    max = A[i];
                }
            } else {
                if (min > A[i]) {
                    min = A[i];
                }
            }
        }
        return max - min;
    }
}
