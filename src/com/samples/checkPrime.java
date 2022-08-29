package com.samples;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        System.out.println("Whether the given number is prime? " + isPrime(prime));
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
}
