package com.scaler.bitmanipulation;

public class SmallestXOR {

    public static void main(String[] args) {
        SmallestXOR minimal = new SmallestXOR();
        int result = minimal.solve(15,5);
        System.out.println(result);
    }


    public int solve(int A, int B) {
        int x = 0;
        // integer range - 2 power 31 to 2 power 31 - 1
        // checking the set bit
        for (int i = 30; i >= 0; i--) {
            // the value of B should be equal to number of bits in x
            // so for edge case, if B is zero, x should be zero
            if (B == 0) {
                return x;
            }
            // checking the msb bit in A, so that can set the same in X
            // to minimise the values of A XOR X, same values leeds to zero when doing XOR
            if (((1 << i) & A) > 0) {
                x = x | (1 << i);
                B--;
            }
        }

        // this loops checks if B is 0, else will set the bits in x
        for (int i = 0; i <= 30; i++) {
            if (B == 0) {
                return x;
            }
            if (((1 << i) & x) == 0) {
                x = x | (1 << i);
                B--;
            }
        }
        return x;
    }
}
