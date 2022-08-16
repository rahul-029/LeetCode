package com.leetcode.Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        List<Integer> duplicate = new ArrayList<>();
        int [] arr = {3, 4, 0, 5, 7, 0, 4, 8};

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    duplicate.add(arr[i]);
                }
            }

        }
        System.out.println(duplicate);
    }
}
