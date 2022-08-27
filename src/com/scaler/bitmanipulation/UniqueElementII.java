package com.scaler.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueElementII {
    public static void main(String[] args) {
        UniqueElementII uniq = new UniqueElementII();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(12);
        arr.add(12);
        arr.add(10);
        arr.add(8);
        ArrayList<Integer> result = uniq.solve(arr);
        System.out.println(result.toString());
    }

    //Method to find two distinct elements
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int uniqueElement = 0;
        //Using XOR to find the unique element
        //Ex: A^A is zero, A^A^B is B
        //XOR of all the elements
        for (Integer integer : A) {
            uniqueElement = uniqueElement ^ integer;
        }
        System.out.println(uniqueElement);
        //Get one set bits of the unique element
        int pos = bitPosition(uniqueElement);
        System.out.println(pos + " first set position");
        int set = 0;
        int unset = 0;
        //Based on the bid position, divide the array into two
        for (Integer integer : A) {
            if (setBitCheck(integer, pos)) {
                set = set ^ integer;
            } else unset = unset ^ integer;
        }
        result.add(set);
        result.add(unset);
        Collections.sort(result);
        return result;
    }

    //Getting the bit position
    public static int bitPosition(int N) {
        int position = 0;
        for (int i = 0; i <= 31; i++) {
            //using left shift operator to find the first set position
            if (((1 << i) & N) != 0) {
                position = i;
                break;
            }
        }
        return position;
    }

    //Check whether the ith bit is set or not
    public static boolean setBitCheck(int A, int I) {
        if (((A >> I) & 1) == 1) {
            return true;
        }
        return false;
    }
}
