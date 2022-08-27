package com.scaler.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
    public static void main(String[] args) {
        UniqueElement ue = new UniqueElement();
        List<Integer> findElement = new ArrayList<>();
        findElement.add(5);
        findElement.add(5);
        findElement.add(10);
        findElement.add(10);
        findElement.add(5);
        findElement.add(5);
        findElement.add(5);
        int result = ue.singleNumber(findElement);
        System.out.println(result);
    }
    public int singleNumber(final List<Integer> A) {
        int unique = 0;
        for (int i = 0; i < A.size(); i++) {
            unique = unique ^ A.get(i);
        }
        return unique;
    }
}

