package com.samples;

public class PrefixSumComputations {


    public static void main(String[] args) {
        int[] input = {2, 6, 4, 3, 8, -1, 3, 2, 0};
        int[] result_arr = leftMax(input);
        for (int i = 0; i < result_arr.length; i++) {
            System.out.print(result_arr[i] + " ");
        }
        int[] result_rightarr = rightMax(input);
        System.out.println();
        for (int i = 0; i < result_rightarr.length; i++) {
            System.out.print(result_rightarr[i] + " ");
        }
        int[] result_leftsum = leftSum(input);
        System.out.println();
        for (int i = 0; i < result_leftsum.length; i++) {
            System.out.print(result_leftsum[i] + " ");
        }

        int[] result_rightsum = rightSum(input);
        System.out.println();
        for (int i = 0; i < result_rightsum.length; i++) {
            System.out.print(result_rightsum[i] + " ");
        }
    }

    //Finding Maximum from l to r
    public static int[] leftMax(int[] A) {
        int N = A.length;
        int[] left_max = new int[N];
        // Edge Case
        left_max[0] = A[0];
        for (int i = 1; i < N; i++) {
            left_max[i] = Math.max(left_max[i - 1], A[i]);
        }
        return left_max;
    }

    //Finding Maximum from r to l
    public static int[] rightMax(int[] A) {
        int N = A.length;
        int[] right_max = new int[N];
        // Edge case
        right_max[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], A[i]);
        }
        return right_max;
    }

    //Finding left sum from l to r
    public static int[] leftSum(int[] A) {
        int N = A.length;
        int[] left_sum = new int[N];
        // Edge case
        left_sum[0] = A[0];
        for (int i = 1; i < N; i++) {
            left_sum[i] = left_sum[i - 1] + A[i];
        }
        return left_sum;
    }

    //Finding right sum from r to l
    public static int[] rightSum(int[] A) {
        int N = A.length;
        int[] right_sum = new int[N];
        //Edge Case
        right_sum[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            right_sum[i] = right_sum[i + 1] + A[i];
        }
        return right_sum;
    }

}
