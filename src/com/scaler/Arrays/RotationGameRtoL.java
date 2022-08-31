package com.scaler.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationGameRtoL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        ArrayList<Integer> inputArr = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            inputArr.add(sc.nextInt());
        }
        //No of times the array should be rotated
        int B = sc.nextInt();

        RotationGameRtoL rotate = new RotationGameRtoL();
        int[] resultArray = rotate.rotateArray(inputArray, B);
        for (int i = 0; i < N; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println(" ");
        ArrayList<Integer> resultList = rotate.rotateArrayList(inputArr,B);
        for(int X: resultList)
        {
            System.out.print(X + " ");
        }

    }

    public int[] rotateArray(int[] A, int B) {
        int N = A.length;
        //This is added to check if the number of rotation is greater than length of the array
        int K = B % N;
        System.out.println(K + " times rotate the array");
        //Swap done using while loop
        int i = 0, j = N - 1;
        while (i < j) {
            A[i] = A[i] ^ A[j];
            A[j] = A[j] ^ A[i];
            A[i] = A[i] ^ A[j];
            i++;
            j--;
        }
        //Swap the sub array from 0 to K-1
        i = 0;
        j = K - 1;
        while (i < j) {
            A[i] = A[i] ^ A[j];
            A[j] = A[j] ^ A[i];
            A[i] = A[i] ^ A[j];
            i++;
            j--;
        }
        //Swap the sub array from K to N-1
        i = K;
        j = N - 1;
        while (i < j) {
            A[i] = A[i] ^ A[j];
            A[j] = A[j] ^ A[i];
            A[i] = A[i] ^ A[j];
            i++;
            j--;
        }
        return A;
    }

    public ArrayList<Integer> rotateArrayList(ArrayList<Integer> A, int B) {
        int N = A.size();
        //If the rotation is greater than the length of Array
        //We can do modules to find how many times we have to rotate the array
        int K = B % N;
        int i = 0, j = N - 1;
        //Reverse the entire arraylist from 0 to N-1
        while (i < j) {
            A.set(i, A.get(i) ^ A.get(j));
            A.set(j, A.get(j) ^ A.get(i));
            A.set(i, A.get(i) ^ A.get(j));
            i++;
            j--;
        }
        //Reverse the element from 0 to K-1
        //(ie) reversing the sub array
        i = 0;
        j = K - 1;
        while (i < j) {
            A.set(i, A.get(i) ^ A.get(j));
            A.set(j, A.get(j) ^ A.get(i));
            A.set(i, A.get(i) ^ A.get(j));
            i++;
            j--;
        }
        //Reverse the sub array from K to N-1
        i = K;
        j = N - 1;
        while (i < j) {
            A.set(i, A.get(i) ^ A.get(j));
            A.set(j, A.get(j) ^ A.get(i));
            A.set(i, A.get(i) ^ A.get(j));
            i++;
            j--;
        }
        return A;
    }
}
