package com.scaler.bitmanipulation;

public class FindSetBitsIII {

    public static void main(String[] args) {
        FindSetBitsIII fsb = new FindSetBitsIII();
        int total_set_bits = fsb.countSetBitI(30);
        System.out.println(total_set_bits);
        int total_set_bits_II = fsb.countSetBitII(30);
        System.out.println(total_set_bits_II);
        boolean isBitSet = fsb.checkSetBit(30, 0);
        int total_set_bits_III = fsb.countSetBitIII(30);
        System.out.println(total_set_bits_III);
    }

    //Method to count number of 1's in passed decimal number.
    //We use bitwise operator
    public int countSetBitI(int N) {
        int count = 0;
        while (N != 0) {
            if (((N & 1) == 1)) {
                count += 1;
            }
            N = N >> 1;
        }
        return count;
    }

    //Method to count total number of 1's in the given number
    //check whether the ith index is set by iterating for ith element from 0 to 31(integer range)
    public int countSetBitII(int A) {
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            if (((A >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }

    //Method checks whether the given Xth bit is set or not
    //Method gets two int parameters
    //Checking whether the given Xth bit is set or not
    public boolean checkSetBit(int A, int X) {
        if (((A >> X) & 1) == 1) {
            System.out.println(X + " bit position is set");
            return true;
        }
        System.out.println(X + " bit position is unset");
        return false;
    }

    //Method returns the set bit count
    //Using AND bitwise operator for A and A-1
    public int countSetBitIII(int A) {
        int count = 0;
        while (A != 0) {
            count++;
            A = A & A - 1;
        }
        return count;
    }
}
