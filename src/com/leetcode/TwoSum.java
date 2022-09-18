package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        //input one
        int[] inputNums = {2, 7, 11, 15};
        int inputTarget = 9;
        //input two
        int[] inputNums1 = {3, 2, 4};
        int inputTarget1 = 6;
        int[] result = twoSum.twoSum(inputNums, inputTarget);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] result1 = twoSum.twoSum1(inputNums1, inputTarget1);
        for (int x : result1) {
            System.out.print(x + " ");
        }
    }

    //O(N*N) complexity
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int[] pair = new int[2];
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (nums[i] + nums[j] == target) {
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }
        return null;
    }

    //O(N) time complexity
    //New learnings
    //Preferred
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> checkMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current_element = nums[i];
            //Problem Desc: A[i] + A[i+1] == target, get the index
            //Consider, current element + x = target, we can rewrite as
            //x = target - current element
            int x = target - current_element;
            if (checkMap.containsKey(x)) {
                return new int[]{
                        checkMap.get(x), i
                };
            }
            checkMap.put(current_element, i);
        }
        return null;
    }

}
