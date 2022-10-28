package com.samples;

public class LeftShiftCheckSetBit {
    public static void main(String[] args) {
        LeftShiftCheckSetBit leftShift = new LeftShiftCheckSetBit();
        int a = 15;
        int k = 3;
        System.out.println(leftShift.checkSetBitUsingLeftShift(a, k));
        int b = 15;
        int i = 4;
        System.out.println(leftShift.checkSetBitUsingLeftShift(b, i));
    }

    // check whether the kth bit is set or not
    // while left shift, msb will be discarded
    // left shift shifts the bits to the left by one bit
    // & will return the exact value of the bit and not 0 or 1
    public boolean checkSetBitUsingLeftShift(int A, int k) {
        return (((1 << k) & A) > 0);
    }
}
