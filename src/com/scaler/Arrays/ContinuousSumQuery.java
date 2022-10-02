package com.scaler.Arrays;

import java.util.ArrayList;

public class ContinuousSumQuery {
    public static void main(String[] args) {
        //First Input
        int A = 5;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(10);
        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(2);
        bList.add(3);
        bList.add(20);
        ArrayList<Integer> cList = new ArrayList<>();
        cList.add(2);
        cList.add(5);
        cList.add(25);
        B.add(aList);
        B.add(bList);
        B.add(cList);
        ContinuousSumQuery continuousSum = new ContinuousSumQuery();

        ArrayList<Integer> result = continuousSum.solve(A, B);
        System.out.println();
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        //Second input
        int A1 = 10;
        ArrayList<ArrayList<Integer>> B1 = new ArrayList<>();
        ArrayList<Integer> aList1 = new ArrayList<>();
        aList1.add(1);
        aList1.add(3);
        aList1.add(10);
        ArrayList<Integer> bList1 = new ArrayList<>();
        bList1.add(6);
        bList1.add(9);
        bList1.add(2);
        ArrayList<Integer> cList1 = new ArrayList<>();
        cList1.add(3);
        cList1.add(5);
        cList1.add(3);
        ArrayList<Integer> dList1 = new ArrayList<>();
        dList1.add(2);
        dList1.add(8);
        dList1.add(4);
        ArrayList<Integer> eList1 = new ArrayList<>();
        eList1.add(6);
        eList1.add(7);
        eList1.add(5);

        B1.add(aList1);
        B1.add(bList1);
        B1.add(cList1);
        B1.add(dList1);
        B1.add(eList1);

        ArrayList<Integer> result1 = continuousSum.solve(A1, B1);
        System.out.println();
        for (int i = 0; i < result1.size(); i++) {
            System.out.print(result1.get(i) + " ");
        }
        System.out.println();
        //Input for Array
        int K = 10;
        int[][] inputArray = {{1, 3, 10}, {6, 9, 2}, {3, 5, 3}, {2, 8, 4}, {6, 7, 5}};
        int[] resultArr = continuousSum.solve(K, inputArray);
        for (int x : resultArr) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> resultArray = new ArrayList<>(A);
        for (int i = 0; i < A; i++) {
            resultArray.add(i, 0);
        }
        int left = 0;
        int right = 0;
        int amount = 0;
        int N = B.get(1).size();
        for (int i = 0; i < B.size(); i++) {
            int j = 0;
            left = B.get(i).get(j);
            j++;
            right = B.get(i).get(j);
            j++;
            amount = B.get(i).get(j);
            resultArray.set(left - 1, resultArray.get(left - 1) + amount);
            if (right < A) {
                resultArray.set(right, resultArray.get(right) - amount);
            }
        }
        //Before Prefix Array
        for (int i = 0; i < resultArray.size(); i++) {
            System.out.print(resultArray.get(i) + " ");
        }
        ArrayList<Integer> prefixArray = new ArrayList<>(A);
        prefixArray.add(0, resultArray.get(0));
        for (int i = 1; i < resultArray.size(); i++) {
            prefixArray.add(i, prefixArray.get(i - 1) + resultArray.get(i));
        }
        return prefixArray;
    }

    public int[] solve(int A, int[][] B) {
        int[] finalArray = new int[A];
        int left = 0;
        int right = 0;
        int amount = 0;
        for (int i = 0; i < B.length; i++) {
            int j = 0;
            left = B[i][j];
            j++;
            right = B[i][j];
            j++;
            amount = B[i][j];
            finalArray[left - 1] = finalArray[left - 1] + amount;
            if (right < A) {
                finalArray[right] = finalArray[right] - amount;
            }
        }
        int[] prefixArray = new int[A];
        prefixArray[0] = finalArray[0];
        for (int i = 1; i < finalArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + finalArray[i];
        }
        return prefixArray;
    }

}
