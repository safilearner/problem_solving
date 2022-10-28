package com.samples;

public class CountSetBits {
    public static void main(String[] args) {
        CountSetBits count = new CountSetBits();
        int k = 127;
        int result = count.countNoOfSetBits(k);
        System.out.println(result);
    }

    // Find number of set bits in an integer
    // set means 1 and unset means 0.
    public int countNoOfSetBits(int A) {
        int count = 0;
        while (A > 0) {
            if ((A & 1) == 1)
                count++;
            A = A >> 1;
        }
        return count;
    }
}
