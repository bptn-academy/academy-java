package com.bptn.course._week3_exercises;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < 5; i++) {
            arr.add(i);
        }
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i=0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                System.out.println("Removing element " + i + " : " + arr.get(i));
                newArr.add(arr.get(i));
     
            }
        }
        System.out.println(newArr);
    }
}

