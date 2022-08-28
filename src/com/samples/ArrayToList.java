package com.samples;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[]{};
        ArrayToList arr = new ArrayToList();
        List<Integer> aList = arr.arrayToArrayList(A);
        for (int x : aList) {
            System.out.print(x + " ");
        }
        System.out.println("");
        List<Integer> bList = arr.arrayToArrayList(B);
        System.out.println("Size of the converted array is " + bList.size());
    }

    public ArrayList<Integer> arrayToArrayList(int[] A) {
        ArrayList<Integer> convertedList = new ArrayList<>();
        int N = A.length;
        if (N != 0) {
            for (int i = 0; i < N; i++) {
                convertedList.add(A[i]);
            }
        } else {
            System.out.println("Input Array is empty!!! So the converted list will be empty");
        }
        return convertedList;
    }
}
