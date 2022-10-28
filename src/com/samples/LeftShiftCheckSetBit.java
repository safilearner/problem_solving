package com.samples;

public class LeftShiftCheckSetBit {

    public static void main(String[] args) {
        LeftShiftCheckSetBit leftCheck = new LeftShiftCheckSetBit();
        int a = 15;
        int k = 3;
        System.out.println(leftCheck.checkSetBitUsingLeftShift(a, k));
        int b = 15;
        int i = 4;
        System.out.println(leftCheck.checkSetBitUsingLeftShift(b, i));
    }

    // Shift the bits using left shift
    // MSB will be discarded
    // Finding whether the given kth bit is set or not using left shift operator
    public boolean checkSetBitUsingLeftShift(int A, int k) {
        return ((A >> k) & 1) == 1;
    }
}
