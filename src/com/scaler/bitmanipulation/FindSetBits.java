package com.scaler.bitmanipulation;

public class FindSetBits {
    public static void main(String[] args) {
        FindSetBits setBits = new FindSetBits();
        int count = setBits.numSetBits(20);
        System.out.println(count);
    }

    public int numSetBits(int A) {
        int result = 0;
        while (A != 0) {
            if ((A & 1) == 1) {
                result += 1;
            }
            A = A >> 1;
        }
        return result;
    }
}
