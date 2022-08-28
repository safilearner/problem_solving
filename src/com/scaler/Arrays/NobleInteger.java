package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public static void main(String[] args) {
        NobleInteger nobleInteger = new NobleInteger();
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(2);
        testList.add(1);
        testList.add(3);
        System.out.println(nobleInteger.solution1(testList));
        ArrayList<Integer> testList1 = new ArrayList<>();
        testList1.add(6);
        testList1.add(7);
        testList1.add(5);
        System.out.println(nobleInteger.solve(testList1));
    }

    //Solution is correct, But will get TLE for larger inputs
    //Time complexity is O(N*N)
    //Need to optimize
    public int solution1(ArrayList<Integer> A) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            int count = 0;
            int p = A.get(i);
            for (int j = 0; j < N; j++) {
                if (A.get(i) < A.get(j)) {
                    count++;
                }
            }
            if (count == p) {
                return 1;
            }
            System.out.println(count + " " + p);
        }
        return -1;
    }

    //Finding noble integer with better time complexity
    //Return 1 if noble integer is present or return -1
    public int solve(ArrayList<Integer> A) {
        //Sorting to make the list in order
        //So we can easily find, current element == number of elements after current element
        //Sorting time complexity is O(NLOGN)
        Collections.sort(A);
        int N = A.size();
        for (int i = 0; i < N - 1; i++) {
            if (A.get(i) == A.get(i + 1)) {
                continue;
            }
            //if Current element == elements left after current element
            if (A.get(i) == N - 1 - i) {
                return 1;
            }
        }
        if (A.get(N - 1) == 0) {
            return 1;
        }
        return -1;
    }
}
