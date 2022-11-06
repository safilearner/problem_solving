package com.scaler.bitmanipulation;

import java.util.ArrayList;

public class SingleNumber {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(2);
        input.add(3);
        input.add(3);
        input.add(6);
        input.add(6);
        input.add(9);
        SingleNumber singleNumber = new SingleNumber();
        int unique = singleNumber.findUniqueNumber(input);
        System.out.println(unique);
    }

    // finding unique number using XOR
    // XOR of two same numbers cancels out them
    // XOR two numbers will make it zero
    public int findUniqueNumber(ArrayList<Integer> A) {
        int result = 0;
        int N = A.size();
        for (int i = 0; i < N; i++) {
            result = result ^ A.get(i);
        }
        return result;
    }
}
