package com.scaler.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AtleastTwoGreater {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(11);
        input.add(17);
        input.add(100);
        input.add(5);
        input.add(18);
        AtleastTwoGreater atleast = new AtleastTwoGreater();
        ArrayList<Integer> output = atleast.solve(input);
        for (int x : output) {
            System.out.print(x + " ");
        }

    }

    // top two greater elements won't have two greater elements that themselves
    // consider firstGreatest which is the greatest in the given list, it won't have any greater elements that itself
    // consider secondGreatest which is the second most greatest element in the list, it won't have one greater element greater than it
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        // initialize first greatest with integer min, so that we can check for the max element
        int firstGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        // find first and second greatest
        for (int i = 0; i < N; i++) {
            if (A.get(i) > firstGreatest) {
                secondGreatest = firstGreatest;
                firstGreatest = A.get(i);
            } else if (A.get(i) > secondGreatest) {
                secondGreatest = A.get(i);
            }
        }
        System.out.println(firstGreatest);
        System.out.println(secondGreatest);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A.get(i) != firstGreatest && A.get(i) != secondGreatest) {
                result.add(A.get(i));
            }
        }

        return result;
    }
}
