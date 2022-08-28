package com.scaler.Arrays;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        LeadersInAnArray leader = new LeadersInAnArray();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(16);
        inputList.add(17);
        inputList.add(4);
        inputList.add(3);
        inputList.add(5);
        inputList.add(2);
        ArrayList<Integer> resultList = leader.solve(inputList);
        for (int x : resultList) {
            System.out.print(x + " ");
        }
    }

    //Time complexity is O(N*N)
    //Can solve in O(N)
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int N = A.size();
        for (int i = 0; i < N; i++) {
            //Now A.get(i) value is fixed, so that we can compare by iterating from j = i to j = N-1
            //if A.get(j) is greater than A.get(i), then A.get(i) is not a leader
            int j;
            for (j = i + 1; j < N; j++) {
                if (A.get(i) <= A.get(j)) {
                    break;
                }
            }
            if (j == N) {
                System.out.println(j + " " + N);
                resultList.add(A.get(i));
            }
        }
        return resultList;
    }
    // TODO: 8/28/2022 Can solve in O(N) time complexity
}
