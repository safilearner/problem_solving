package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CheckArithmeticProgression {

    public static void main(String[] args) {
        CheckArithmeticProgression isAp = new CheckArithmeticProgression();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(5);
        input.add(9);
        input.add(7);
        input.add(3);
        int result = isAp.solve(input);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        //Step 1: find the common difference
        //In Arithmetic Progression, common difference is same in the consecutive pair in a sequence
        int common_difference = Math.abs(A.get(0) - A.get(1));
        System.out.println("common difference " + common_difference);
        for (int i = 1; i < A.size(); i++) {
            //If Difference of consecutive number is not equal to common difference, then the sequence is not AP.
            if (A.get(i) - A.get(i - 1) != common_difference) {
                return 0;
            }
        }
        return 1;
    }
}
