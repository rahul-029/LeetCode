package com.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {

    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> kids = kidsWithCandies(candies, extraCandies);
        System.out.println(kids);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsWithGreatestCandies = new ArrayList<>();

        int greatest = candies[0];
        for(int a: candies){
            if(a > greatest){
                greatest = a;
            }
        }

        for(int i=0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatest){
                kidsWithGreatestCandies.add(true);
            } else{
                kidsWithGreatestCandies.add(false);
            }
        }

        return kidsWithGreatestCandies;

    }
}
