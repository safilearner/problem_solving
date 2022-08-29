package com.samples;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        System.out.println("Whether the given number is prime? " + isPrime(prime));
        System.out.println("Whether the given number is prime? " + primeCheck(prime));
        sc.close();
    }

    //Check if the number is prime
    //A number is prime if it has exactly two factors
    //1 and itself are prime
    public static boolean isPrime(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            //Modules operator is to find the remainder
            if (N % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    //A number is said to be prime if it has no factors from 2 to root N
    public static boolean primeCheck(int N) {
        if (N <= 1) {
            return false;
        }
        //checking if any factors existing between 2 to root N
        //Even if it contains one factor then return false because it is not prime
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
}
