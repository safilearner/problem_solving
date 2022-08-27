package com.scaler;

import java.util.ArrayList;

public class MinOddMaxEven {
    public int solve(ArrayList<Integer> A) {
        int size = A.size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if ((A.get(i) & 1) == 0) {
                if (max < A.get(i))
                    max = A.get(i);
            } else if ((A.get(i) & 1) == 1) {
                if (min > A.get(i)) {
                    min = A.get(i);
                }
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        MinOddMaxEven minOddMaxEven = new MinOddMaxEven();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(0);
        arr.add(7);
        int diff = minOddMaxEven.solve(arr);
        System.out.println(diff);
    }
}
