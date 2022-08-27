package com.scaler;

import java.util.ArrayList;

public class TwoGreaterElements {
    public static void main(String[] args) {
        TwoGreaterElements twoGr = new TwoGreaterElements();
        ArrayList<Integer> arrGr = new ArrayList<>();
        arrGr.add(5);
        arrGr.add(2);
        arrGr.add(12);
        twoGr.solve(arrGr);
        System.out.println(arrGr.toString());
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > max)
                max = A.get(i);
        }
        A.remove(Integer.valueOf(max));
        max = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > max)
                max = A.get(i);
        }
        A.remove(Integer.valueOf(max));
        return A;
    }
}
