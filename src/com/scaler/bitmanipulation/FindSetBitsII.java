package com.scaler.bitmanipulation;

public class FindSetBitsII {
    //This class is to find ith set bit.

    //Main method to test whether the given bit is set or not
    public static void main(String[] args) {
        FindSetBitsII fsb = new FindSetBitsII();
        System.out.println(fsb.isSetBit(30,3));
    }


    //This method has two integer arguments in which we pass N and the index i
    //Returns true if ith index is set
    public boolean isSetBit(int N, int i) {
        if (((N >> i) & 1) == 1) {
            return true;
        }
        return false;
    }
}
