package com.samples;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(2);
        input.add(3);
        solve(input);
        solve2(input);
    }

    public static void solve(List<Integer> aList) {
        int N = aList.size();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + aList.get(k);
                }
                System.out.println(sum + " ");
            }
        }
    }

    public static void solve2(List<Integer> aList) {
        int N = aList.size();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + aList.get(j);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
