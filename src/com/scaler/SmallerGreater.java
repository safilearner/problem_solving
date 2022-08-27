package com.scaler;

import java.util.ArrayList;

public class SmallerGreater {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
            if (A.get(i) < min) {
                min = A.get(i);
            }
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > min && A.get(i) < max) {
                count = count + 1;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        SmallerGreater sm = new SmallerGreater();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(0);
        int result = sm.solve(arr);
        System.out.println(result);
    }
}
