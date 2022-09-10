package com.scaler.Arrays;

import java.util.ArrayList;

public class MulOfPreAndNext {
    public static void main(String[] args) {
        MulOfPreAndNext mul = new MulOfPreAndNext();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        ArrayList<Integer> result = mul.solve(input);
        for (int X : result) {
            System.out.print(X + " ");
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = A.size();
        int K = 0;
        if (A.size() == 1) {
            return A;
        }
        result.add(A.get(K) * A.get(K + 1));
        for (int i = 1; i < N - 1; i++) {
            result.add(A.get(i - 1) * A.get(i + 1));
        }
        result.add(A.get(N - 1) * A.get(N - 2));
        return result;
    }
}
