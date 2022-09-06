package com.scaler.Arrays;

public class StartEndIndex {

    public static void main(String[] args) {
        int[] input = {5, 7, 8, 9, 1, 2, 3, 4, 11, 45};
        int K = 4;
        printIndex(input, K);
    }

    public static void printIndex(int[] A, int B) {
        int N = A.length;
        //Printing indices of i and j of length B
        for (int i = 0; i <= N - B; i++) {
            int j = i + B - 1;
            System.out.println(i + " " + j);
        }
    }
}
