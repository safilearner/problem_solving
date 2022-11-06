package com.scaler.bitmanipulation;

public class ReverseIntegerUsingBits {

    public static void main(String[] args) {
        ReverseIntegerUsingBits rev = new ReverseIntegerUsingBits();
        long a = 0;
        long result = rev.reverse(a);
        System.out.println(result);
    }

    public long reverse(long a) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            // checking if the ith bit is set or not
            if ((a & (1 << i)) > 0) {
                // if set, form the decimal number from 2 power 31 to 2 power 0
                ans = (long) (ans + Math.pow(2, 31 - i));
            }
        }
        return ans;
    }

}
