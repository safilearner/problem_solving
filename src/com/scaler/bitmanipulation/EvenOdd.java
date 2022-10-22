package com.scaler.bitmanipulation;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even or odd: ");
        boolean result = evenOdd.findEvenorOdd(sc.nextInt());
        System.out.println("Number is even? " + result);
        System.out.println("Enter another number: ");
        boolean secondResult = evenOdd.bitwiseCheckForEvenOrOdd(sc.nextInt());
        System.out.println("Even Number? " + secondResult);
        sc.close();
    }

    // return true if the number is true
    public boolean findEvenorOdd(int A) {
        if (A % 2 == 0) {
            return true;
        }
        return false;
    }

    // Using Bitwise Operators
    // Using Bitwise & here to check whether the number is even or odd
    // 0 & 1 == 0, if a = 0, 0 & 1 will give us 0 which means even
    // vice versa
    // bitwise is little faster than modulo
    public boolean bitwiseCheckForEvenOrOdd(int A) {
        if ((A & 1) == 0) {
            return true;
        }
        return false;
    }
}
