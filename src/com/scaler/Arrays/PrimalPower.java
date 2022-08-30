package com.scaler.Arrays;

import java.util.ArrayList;

public class PrimalPower {
    public static void main(String[] args) {
        int[] arr = {97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3};
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int X : arr) {
            inputList.add(X);
        }
        PrimalPower power = new PrimalPower();
        int result2 = power.solve(inputList);
        int result = power.primeNumberCount(arr);
        System.out.println(result);
        System.out.println(result2);
    }

    //Checking prime, if the number has any single factor between 2 to root(N)
    //It is not prime
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int count = 0;
        //Iterating through all the elements in passed list
        for (int i = 0; i < N; i++) {
            //If the element is less than 2, it is not prime
            if (A.get(i) > 1) {
                boolean checkBoolean = true;
                //To Check whether the array elements is prime
                for (int j = 2; j * j <= A.get(i); j++) {
                    //Even single factor will make the number as not prime
                    //If divisible by j, it is not prime
                    if ((A.get(i) % j == 0)) {
                        checkBoolean = false;
                    }
                }
                if (checkBoolean) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public int primeNumberCount(int[] A) {
        int N = A.length;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                ans += 1;
            }
        }
        return ans;
    }

}
