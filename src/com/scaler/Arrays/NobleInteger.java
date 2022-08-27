package com.scaler.Arrays;

import java.util.ArrayList;

public class NobleInteger {
    public static void main(String[] args) {
        NobleInteger nobleInteger = new NobleInteger();
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(2);
        testList.add(1);
        testList.add(3);
        System.out.println(nobleInteger.solve(testList));
    }

    //Solution is correct, But will get TLE for larger inputs
    //Need to optimize
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            int count = 0;
            int p = A.get(i);
            for (int j = 0; j < N; j++) {
                if (A.get(i) < A.get(j)) {
                    count++;
                }
            }
            if (count == p) {
                return 1;
            }
            System.out.println(count + " " + p);
        }
        return -1;
    }
}
