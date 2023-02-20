package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        int n = 15;
        System.out.println(fizzBuzz(n));

    }

    private static List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();
        for(int i=1; i <= n; i++){
            if(i % 3 == 0 && i% 5 == 0){
               ans.add("fizzBuzz");
            } else if(i % 3 == 0){
                ans.add("fizz");
            } else if(i % 5 == 0 ){
                ans.add("buzz");
            } else {
                ans.add(Integer.toString(i));
            }
        }

        return ans;
    }
}
