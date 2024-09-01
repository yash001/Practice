package org.example.sortingAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
    public static void main(String[] args) {
//        String str = "aaaaaaammdddddkkkkx";
        String str = "zzzzzrrrrgwwwwwnn";
        Map<Character, Integer> feqMap = new HashMap<>();
        String [] strArray = str.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=strArray.length -1;i++){
            Character ch = str.charAt(i);
            feqMap.put(ch,feqMap.getOrDefault(ch,0)+ 1);
        }
        System.out.println(feqMap);

        feqMap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue())
                .forEach(record ->{
                    Character key = record.getKey();
                    Integer value = record.getValue();
                    for (int i = 0;i<value;i++){
                        sb.append(key)
                        ;
                    }
                });


        System.out.println(feqMap);
        System.out.println(sb);

    }
}

