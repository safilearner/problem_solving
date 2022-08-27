package com.scaler.Arrays;

import java.util.ArrayList;

public class CheckPair {
    //No of Iterations are higher
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //i should not be equal to j
                if (i == j) {
                    continue;
                } else {
                    if (A.get(i) + A.get(j) == B) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CheckPair goodPair = new CheckPair();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(0);
        aList.add(2);
        aList.add(4);
        aList.add(8);
        aList.add(5);
        int B = 5;
        int result = goodPair.solve(aList, B);
        System.out.println(result);
    }
}
