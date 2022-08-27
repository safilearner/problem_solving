package com.scaler.Arrays;

import java.util.ArrayList;

public class TimeToEquality {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(4);
        aList.add(1);
        aList.add(3);
        aList.add(2);
        System.out.println(solve(aList));
    }
    public static int solve(ArrayList<Integer> A) {
        int times = 0;
        int N = A.size();
        int max = Integer.MIN_VALUE;
        //finding max
        for (int i = 0; i < N; i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
        }
        //we can find the difference of every integer between max and the other integers
        //so that if we do summation of the difference, we can find the minimum times to make it all same integers
        for (int i = 0; i < N; i++) {
            times = times + Math.abs(max - A.get(i));
        }

        return times;
    }
}
