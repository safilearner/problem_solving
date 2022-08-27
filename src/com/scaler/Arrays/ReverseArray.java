package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray rev = new ReverseArray();
        List<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(4);
        inputArray.add(5);
        ArrayList<Integer> aList = rev.reverseDynamicArrayUsingXOR(inputArray);
        for (int a : aList) {
            System.out.print(a + " ");
        }
        System.out.println();
        int A[] = {1, 2, 3, 4, 5};
        int res[] = rev.reverseUsingXOR(A);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    //The logic to reverse the dynamic array
    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> resultArr = new ArrayList<>(A.size());
        for (int i = 0; i < A.size(); i++) {
            resultArr.add(A.get(i));
        }
        int i = 0;
        int j = resultArr.size() - 1;
        while (i < j) {
            //swap the positions, i to j and j to i
            //use extra variables to swap
            int temp = resultArr.get(i);
            resultArr.set(i, resultArr.get(j));
            resultArr.set(j, temp);
            i++;
            j--;
        }
        return resultArr;
    }

    //The logic to reverse the array
    public int[] revArray(int[] A) {
        int N = A.length;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

    //Using Bitwise Operator XOR for reversing Array
    //A is read only, don't change A
    //fastest operation
    //preferred solution
    public int[] reverseUsingXOR(final int[] A) {
        int result[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i];
        }
        int i = 0;
        int j = result.length - 1;
        while (i < j) {
            result[i] = result[i] ^ result[j];
            result[j] = result[j] ^ result[i];
            result[i] = result[i] ^ result[j];
            i++;
            j--;
        }
        return result;
    }

    //Using Bitwise Operator XOR for reversing Dynamic Array
    public ArrayList<Integer> reverseDynamicArrayUsingXOR(final List<Integer> A) {
        ArrayList<Integer> resReverse = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            resReverse.add(A.get(i));
        }
        int i = 0;
        int j = resReverse.size() - 1;
        while (i < j) {
            resReverse.set(i, resReverse.get(i) ^ resReverse.get(j));
            resReverse.set(j, resReverse.get(j) ^ resReverse.get(i));
            resReverse.set(i, resReverse.get(i) ^ resReverse.get(j));
            i++;
            j--;
        }
        return resReverse;
    }
}
