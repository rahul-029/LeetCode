package com.leetcode.Strings;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountWordOccurences {

    public static void main(String[] args) {

        String str = "FOO BAR FOOBAR BARFOO FOO BAR";  //output should be {FOO=2, BAR=2, FOOBAR=1, BARFOO=1}
        String [] words = str.split(" ");


        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i < words.length; i++){
            int count = 0;
            for(int j=0; j < words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    map.put(words[i], count = count + 1);
                }
            }
        }

        /*for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }*/

        System.out.println(map);
    }
}
