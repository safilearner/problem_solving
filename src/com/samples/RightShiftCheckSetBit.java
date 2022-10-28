package com.samples;

public class RightShiftCheckSetBit {

    public static void main(String[] args) {
        RightShiftCheckSetBit leftCheck = new RightShiftCheckSetBit();
        int a = 15;
        int k = 3;
        System.out.println(leftCheck.checkSetBitUsingRightShift(a, k));
        int b = 15;
        int i = 4;
        System.out.println(leftCheck.checkSetBitUsingRightShift(b, i));
    }

    // Shift the bits using right shift
    // MSB will be discarded
    // Finding whether the given kth bit is set or not using right shift operator
    public boolean checkSetBitUsingRightShift(int A, int k) {
        return ((A >> k) & 1) == 1;
    }
}
