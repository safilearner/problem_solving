package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfMinAndMax {
    public static void main(String[] args) {
        SumOfMinAndMax sumOfMinAndMax = new SumOfMinAndMax();
        ArrayList<Integer> aList = new ArrayList<>();
        //[-2, 1, -4, 5, 3]
        aList.add(-2);
        aList.add(1);
        aList.add(-4);
        aList.add(5);
        aList.add(3);
        int result = sumOfMinAndMax.solve(aList);
        System.out.println(result);
        int result1 = sumOfMinAndMax.solve1(aList);
        System.out.println(result1);
    }

    //With Sorting, time complexity is O(Log N)
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = A.get(0);
        int max = A.get(A.size() - 1);
        int result = max + min;
        return result;
    }

    //Time Complexity: O(N)
    //Better approach than sorting
    public int solve1(ArrayList<Integer> A) {
        int result = 0;
        int N = A.size();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (min > A.get(i)) {
                min = A.get(i);
            }
            if (max < A.get(i)) {
                max = A.get(i);
            }
        }
        result = max + min;
        return result;
    }
}
