package com.scaler.Arrays;

import java.util.ArrayList;

public class PatternPrintingI {

    public static void main(String[] args) {
        PatternPrintingI pattern = new PatternPrintingI();
        ArrayList<ArrayList<Integer>> output = pattern.solve(3);
        for (ArrayList<Integer> X : output) {
            for (int S : X) {
                System.out.print(S + " ");
            }
            System.out.println();
        }
        int[][] output1 = pattern.solve1(3);
        for (int[] A : output1) {
            for (int X : A) {
                System.out.print(X + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= A; j++) {
                if (j <= i) {
                    temp.add(j);
                } else
                    temp.add(0);
            }
            result.add(temp);
        }
        return result;
    }

    //using 2D array
    public int[][] solve1(int A) {
        int[][] ans = new int[A][A];
        for (int i = 0; i < A; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j <= i; j++) {
                System.out.println(i + " " + j );
                ans[i][j] = j + 1;
            }
        }
        return ans;
    }
}
