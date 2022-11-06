package com.samples;

public class RightShiftCheckSetBit {

    public static void main(String[] args) {
        RightShiftCheckSetBit rightCheck = new RightShiftCheckSetBit();
        int a = 15;
        int k = 2;
        System.out.println(rightCheck.checkSetBitUsingRightShift(a, k));
        int b = 40;
        int i = 5;
        System.out.println(rightCheck.checkSetBitUsingRightShift(b, i));
    }

    // Shift the bits using right shift
    // Finding whether the given kth bit is set or not using right shift operator
    public boolean checkSetBitUsingRightShift(int A, int k) {
        return ((A >> k) & 1) == 1;
    }
}
