package com.scaler.Arrays;

import java.util.ArrayList;

public class LeftAndRightMax {
    public static void main(String[] args) {
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(7);
        inputArray.add(-2);
        inputArray.add(-3);
        inputArray.add(7);
        inputArray.add(2);
        inputArray.add(6);
        LeftAndRightMax max = new LeftAndRightMax();
        ArrayList<Integer> leftMaxResult = max.findLeftMax(inputArray);
        ArrayList<Integer> rightMaxResult = max.findRightMax(inputArray);
        for (int x : leftMaxResult) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : rightMaxResult) {
            System.out.print(x + " ");
        }

    }

    //Finding Left Max by iterating from left to right
    public ArrayList<Integer> findLeftMax(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> leftMaxArray = new ArrayList<>();
        //Edge Case
        leftMaxArray.add(0, A.get(0));
        for (int i = 1; i < N; i++) {
            leftMaxArray.add(i, Math.max(leftMaxArray.get(i - 1), A.get(i)));
        }
        return leftMaxArray;
    }

    //Finding Right Max by iterating from right to left
    //ArrayList
    public ArrayList<Integer> findRightMax(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> rightMaxArray = new ArrayList<>(N);
        for (int i = 0; i < A.size(); i++) {
            rightMaxArray.add(0);
        }
        //Edge Case
        rightMaxArray.set(N - 1, A.get(N - 1));
        for (int i = N - 2; i >= 0; i--) {
            rightMaxArray.set(i, Math.max(rightMaxArray.get(i + 1), A.get(i)));
        }
        return rightMaxArray;
    }

}
