package com.scaler.Arrays;

import java.util.ArrayList;

public class ClosestMinMax {

    public static void main(String[] args) {
        ClosestMinMax closest = new ClosestMinMax();
        //Input 1
        ArrayList<Integer> inputArr1 = new ArrayList<>();
        inputArr1.add(6);
        inputArr1.add(1);
        inputArr1.add(-1);
        inputArr1.add(-4);
        inputArr1.add(3);
        inputArr1.add(8);
        inputArr1.add(1);
        inputArr1.add(2);
        inputArr1.add(8);
        inputArr1.add(-4);
        inputArr1.add(5);
        inputArr1.add(1);
        int result1 = closest.solve(inputArr1);
        System.out.println("Length of the smallest sub array " + result1);
        //A : [ 814, 761, 697, 483, 981 ]
        ArrayList<Integer> inputArr2 = new ArrayList<>();
        inputArr2.add(814);
        inputArr2.add(761);
        inputArr2.add(697);
        inputArr2.add(483);
        inputArr2.add(981);
        int result2 = closest.solve(inputArr2);
        System.out.println("Length of the smallest sub array " + result2);

        int result3 = closest.solve1(inputArr2);
        System.out.println("Length of the smallest sub array using O(N) time complexity " + result3);
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans = N;
        for (int i = 0; i < N; i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
            if (min > A.get(i))
                min = A.get(i);
        }
        //System.out.println(min + " " + max);
        //Edge Case: If all the array elements are same
        if (max == min) {
            return 1;
        }
        //Iterate from L-R
        //If we find max first, then find first min, calculate the length
        //If we find the min first, then find first max to the right, calculate the length
        //Finding the minimum length
        //O(N*N) is the time complexity
        //A : [ 814, 761, 697, 483, 981 ]
        for (int i = 0; i < N; i++) {
            if (A.get(i) == max) {
                for (int j = i + 1; j < N; j++) {
                    if (A.get(j) == min) {
                        ans = Math.min(ans, j - i + 1);
                    }
                }
            }
            if (A.get(i) == min) {
                for (int j = i + 1; j < N; j++) {
                    if (A.get(j) == max) {
                        ans = Math.min(ans, j - i + 1);
                    }
                }
            }
        }
        return ans;
    }

    //O(N) time complexity
    public int solve1(ArrayList<Integer> A) {
        int N = A.size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //Finding min and max
        for (int i = 0; i < A.size(); i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
            if (min > A.get(i)) {
                min = A.get(i);
            }
        }
        //Edge Case
        if (max == min) {
            return 1;
        }
        int min_index = 2 * N;
        int max_index = 2 * N;
        int ans = N;
        for (int i = N - 1; i >= 0; i--) {
            if (A.get(i) == max) {
                ans = Math.min(ans, min_index - i + 1);
                max_index = i;
            } else if (A.get(i) == min) {
                ans = Math.min(ans, max_index - i + 1);
                min_index = i;
            }
        }
        return ans;
    }
}
