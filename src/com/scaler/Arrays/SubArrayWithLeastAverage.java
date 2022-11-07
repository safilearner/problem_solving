package com.scaler.Arrays;

import java.util.ArrayList;

public class SubArrayWithLeastAverage {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        // [3, 7, 5, 20, -10, 0, 12]
        // A=[3, 7, 90, 20, 10, 50, 40]
        //A : [ 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 ]
        //B : 9
        //A : [ 5, 15, 7, 6, 3, 4, 18, 14, 13, 7, 3, 7, 2, 18 ]
        //B : 6
        input.add(5);
        input.add(15);
        input.add(7);
        input.add(6);
        input.add(3);
        input.add(4);
        input.add(18);
        input.add(14);
        input.add(13);
        input.add(7);
        input.add(3);
        input.add(7);
        input.add(2);
        input.add(18);
        int B = 6;
        SubArrayWithLeastAverage sub = new SubArrayWithLeastAverage();
        int result = sub.solve(input, B);
        System.out.println(result);
        int result1 = sub.solveSW(input, B);
        System.out.println(result1);
    }

    // The Highest sum will have the high average
    // The Lowest sum will have the least average
    // Finding the lowest sum and returning the index will be enough
    // O(N*N) Time complexity
    public int solve(ArrayList<Integer> A, int B) {
        int index = 0;
        int N = A.size();
        // the window length is same,
        // so i needs to be iterated from i to B - 1
        int total_sum = Integer.MAX_VALUE;
        for (int i = 0; i <= N - B; i++) {
            int temp = 0;
            // and j should iterate till i + B - 1;
            int j = i + B - 1;
            for (int k = i; k <= j; k++) {
                temp = temp + A.get(k);
            }
            if (total_sum > temp) {
                total_sum = temp;
                index = i;
            }
        }
        return index;
    }

    // Sliding window can be used because of fixed length of the window
    // O(N) time complexity
    // Optimal solution
    public int solveSW(ArrayList<Integer> A, int B) {
        int index = 0;
        int N = A.size();
        int total_sum = 0;
        int sum = 0;
        // Solving edge case
        // For i = 0, doing sliding window will cause index out of bound
        for (int i = 0; i <= N - B; i++) {
            total_sum = total_sum + A.get(i);
            sum = total_sum;
        }
        for (int i = 1; i <= N - B; i++) {
            int j = i + B - 1;
            total_sum = total_sum - A.get(i - 1) + A.get(j);
            if (sum > total_sum) {
                sum = total_sum;
                index = i;
            }
        }
        return index;
    }
}
