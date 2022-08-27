package com.scaler.Arrays;

import java.util.ArrayList;

public class CheckPair {
    //No of Iterations are higher
    public int solution1(ArrayList<Integer> A, int B) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //i should not be equal to j
                if (i == j) {
                    continue;
                } else {
                    if (A.get(i) + A.get(j) == B) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public int solution2(ArrayList<Integer> A, int B) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A.get(i) + A.get(j) == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CheckPair goodPair = new CheckPair();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(0);
        aList.add(2);
        aList.add(4);
        aList.add(8);
        aList.add(5);
        int B = 5;
        int result1 = goodPair.solution1(aList, B);
        System.out.println(result1);
        int C = 8;
        int result2 = goodPair.solution1(aList, B);
        System.out.println(result2);
        System.out.println(goodPair.solution1(aList, 1));
        System.out.println(goodPair.solution2(aList, 1));
    }
}
