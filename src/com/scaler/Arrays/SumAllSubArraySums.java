package com.scaler.Arrays;

import java.util.ArrayList;

public class SumAllSubArraySums {

    public static void main(String[] args) {
        SumAllSubArraySums sumSub = new SumAllSubArraySums();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(2);
        input.add(-2);
        input.add(7);
        input.add(-8);
        input.add(4);
        sumSub.solve(input);
        sumSub.solve1(input);
        sumSub.solve2(input);
    }

    //Return Sum Of Sub Arrays Sum
    //O(N*N*N)
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                //Got All Sub Arrays
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + A.get(k);
                }
                total += sum;
            }
        }
        System.out.println(total);
        return total;
    }

    //O(N*N)
    public int solve1(ArrayList<Integer> A) {
        int N = A.size();
        int total = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A.get(j);
                total = total + sum;
            }
        }
        System.out.println(total);
        return total;
    }

    //O(N)
    //Contribution Technique
    public Long solve2(ArrayList<Integer> A) {
        int N = A.size();
        long sum = 0;
        long total = 0;
        for (int i = 0; i < N; i++) {
            long left = i + 1;
            long right = N - i;
            //No of times the value of an index appears in an array list
            //Multiply the value with total appearances in an sub array
            total = (left * right) * A.get(i);
            sum = sum + total;
        }
        System.out.println(sum);
        return sum;
    }
}
