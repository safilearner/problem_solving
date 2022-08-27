package com.scaler.Arrays;

import java.util.ArrayList;

public class FizzBizz {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> resultArr = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultArr.add("FizzBuzz");
            } else if (i % 5 == 0) {
                resultArr.add("Buzz");
            } else if (i % 3 == 0) {
                resultArr.add("Fizz");
            } else {
                resultArr.add(String.valueOf(i));
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        FizzBizz fizz = new FizzBizz();
        ArrayList<String> result = fizz.fizzBuzz(15);
        for (String str : result) {
            System.out.println(str);
        }
    }
}
