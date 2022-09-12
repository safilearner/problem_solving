package com.scaler.Arrays;

import java.util.ArrayList;

public class PrefixArrayI {

    public static void main(String[] args) {
        PrefixArrayI prefix = new PrefixArrayI();
        int[] input = {5, 7, 1, -1, 3, 4, 6, 2, 9};
        int[] result = prefix.createPrefixArray(input);
        for (int X : result) {
            System.out.print(X + " ");
        }
        ArrayList<Integer> inputPrefix = new ArrayList<>();
        for (int X : input) {
            inputPrefix.add(X);
        }
        System.out.println();
        ArrayList<Integer> resultPrefix = prefix.createPrefixArrayList(inputPrefix);
        for (int X : resultPrefix) {
            System.out.print(X + " ");
        }
    }

    //Prefix Sum: Array
    //Pre computing the values in the new array
    public int[] createPrefixArray(int[] A) {
        int N = A.length;
        int[] pf = new int[N];
        pf[0] = A[0];
        for (int i = 1; i < N; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        return pf;
    }

    public ArrayList<Integer> createPrefixArrayList(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> prefix = new ArrayList<>();
        //Edge Case
        prefix.add(A.get(0));
        //Creating prefix array list
        for (int i = 1; i < N; i++) {
            prefix.add(prefix.get(i - 1) + A.get(i));
        }
        return prefix;
    }
}

