package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class DiffBthMaxBthMin {

    public static void main(String[] args) {
        DiffBthMaxBthMin diff = new DiffBthMaxBthMin();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(5);
        aList.add(3);
        aList.add(4);
        int res = diff.solve(aList, 2);
        System.out.println(res);
        int res1 = diff.solve2(aList, 2);
        System.out.println(res1);
    }

    //Find the difference between Bth max and Bth Min
    //If B is 2, find 2nd max and 2nd min and find the difference
    public int solve(ArrayList<Integer> A, int B) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //Sort the Array List
        Collections.sort(A);
        for (int i = 0; i < B; i++) {
            min = A.get(i);
        }
        Collections.reverse(A);
        for (int i = 0; i < B; i++) {
            max = A.get(i);
        }
        int result = max - min;
        return result;
    }

    //Another way, sort once
    public int solve2(ArrayList<Integer> A, int B) {
        int N = A.size();
        Collections.sort(A);
        int max = A.get(N - B);
        int min = A.get(B - 1);
        int result = max - min;
        return result;
    }
}
