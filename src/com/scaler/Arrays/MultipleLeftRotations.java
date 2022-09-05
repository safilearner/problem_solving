package com.scaler.Arrays;


import java.util.ArrayList;

public class MultipleLeftRotations {
    public static void main(String[] args) {
        MultipleLeftRotations multiple = new MultipleLeftRotations();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(4);
        inputList.add(7);
        inputList.add(2);
        inputList.add(8);
        inputList.add(6);
        ArrayList<Integer> rotateList = new ArrayList<>();
        rotateList.add(1);
        rotateList.add(2);
        rotateList.add(3);
        ArrayList<ArrayList<Integer>> result = multiple.solve(inputList, rotateList);
        for (ArrayList<Integer> res : result) {
            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    //Rotate the arraylist Left to Right
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int N = a.size();
        for (int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                //Rotating logic
                temp.add(a.get((i + x) % N));
            }
            result.add(temp);
        }
        return result;
    }
}
