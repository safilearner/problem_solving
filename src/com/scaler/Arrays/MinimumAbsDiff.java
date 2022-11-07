package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumAbsDiff {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        //5, 17, 100, 11
        input.add(5);
        input.add(17);
        input.add(100);
        input.add(11);
        MinimumAbsDiff min = new MinimumAbsDiff();
        int result = min.solveAbs(input);
        System.out.println(result);

        int result1 = min.solve(input);
        System.out.println(result1);
    }
    // Solved in O(N*N)
    public int solveAbs(ArrayList<Integer> A) {
        int N = A.size();
        int min_value = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                min_value = Math.abs(A.get(i) - A.get(j));
                if (min > min_value) {
                    min = min_value;
                }
            }
        }
        return min;
    }

    // Sorted the array
    // if the elements are in order, the adjacent elements must be subtracted
    // so can solve in O(NLogN) TC.
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        Collections.sort(A);
        for (int i = 0; i < A.size() - 1; i++) {
            int diff = Math.abs(A.get(i) - A.get(i + 1));
            if (min > diff) {
                min = diff;
            }
        }
        return min;
    }


}
