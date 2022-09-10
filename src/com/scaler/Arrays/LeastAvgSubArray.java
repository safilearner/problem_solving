package com.scaler.Arrays;

import java.util.ArrayList;

public class LeastAvgSubArray {

    public static void main(String[] args) {
        LeastAvgSubArray leastAvg = new LeastAvgSubArray();

        //input one
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        ArrayList<Integer> inputList1 = new ArrayList<>();
        for (int j : A) {
            inputList1.add(j);
        }
        int B = 3;
        //int res = leastAvg.solve(inputList1, B);
        //System.out.println(res);

        //input two
        int[] C = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int D = 9;
        ArrayList<Integer> inputList2 = new ArrayList<>();
        for (int j : C) {
            inputList2.add(j);
        }
        //int res2 = leastAvg.solve(inputList2, D);
        //System.out.println(res2);

        //input three
        int[] E = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
        int F = 1;
        ArrayList<Integer> inputList3 = new ArrayList<>();
        for (int j : E) {
            inputList3.add(j);
        }
        //int res3 = leastAvg.solve(inputList3, F);
        //System.out.println(res3);

        //input four
        int[] X = {5, 15, 7, 6, 3, 4, 18, 14, 13, 7, 3, 7, 2, 18};
        int Y = 6;

        ArrayList<Integer> inputList4 = new ArrayList<>();
        for (int j : X) {
            inputList4.add(j);
        }
        int res4 = leastAvg.solve(inputList4, Y);
        System.out.println(res4);

    }

    //Fixed Length? Then use sliding window
    //Return the starting index which has less average of fixed window size
    //Less sum will have less average - Observation
    //We are returning the index and not the average, so no need average calculation
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0;
        int index = 0;
        int min = Integer.MAX_VALUE;
        //Edge case for sliding window
        for (int i = 0; i < B; i++) {
            sum = sum + A.get(i);
            min = sum;
        }
        System.out.println("index value " + index);
        System.out.println("sum for edge case " + sum);
        //Sliding window technique used because the length is fixed
        //TC: O(N)
        for (int i = 1; i <= N - B; i++) {
            int j = i + B - 1;

            sum = sum - A.get(i - 1) + A.get(j);
            System.out.println("sum " + i + " " + sum);
            if (min > sum) {
                min = sum;
                index = i;
            }
            System.out.println("min " + min);
        }
        return index;
    }
}
