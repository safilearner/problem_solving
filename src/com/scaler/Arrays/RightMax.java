package com.scaler.Arrays;

public class RightMax {

    public static void main(String[] args) {
        RightMax right = new RightMax();
        int[] input = {2, 6, 4, 3, 8, -1, 3, 2, 0};
        int[] result = right.calculateRightMax(input);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    //Calculate right max
    public int[] calculateRightMax(int[] nums) {
        int N = nums.length;
        int[] right_array = new int[N];
        //Edge case
        right_array[N - 1] = nums[N - 1];
        //Iterating the array elements to calculate right max
        //Iterating from right to left
        for (int i = N - 2; i >= 0; i--) {
            right_array[i] = Math.max(right_array[i + 1], nums[i]);
        }
        return right_array;
    }
}
