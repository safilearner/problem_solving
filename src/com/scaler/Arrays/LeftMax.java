package com.scaler.Arrays;

public class LeftMax {
    public static void main(String[] args) {
        LeftMax left = new LeftMax();
        int[] input = {2, 6, 4, 3, 8, -1, 3, 2, 0};
        int[] result = left.calculateLeftMax(input);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    //Calculating maximum from left to right
    public int[] calculateLeftMax(int[] nums) {
        int N = nums.length;
        int[] right_array = new int[N];
        //Edge Case Solution
        right_array[0] = nums[0];
        //Iterating and calculating from max
        //Iterating from Left to Right
        for (int i = 1; i < N; i++) {
            right_array[i] = Math.max(right_array[i - 1], nums[i]);
        }
        return right_array;
    }
}
