package org.example.BasicExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Program1 {

    public static void main(String args[])
    {
//        System.out.println("hello");
//        int a  = 3;
//        int b = 3;
////        if(a  == b) {
////            System.out.println("true");
////        } else {
////            System.out.println("false");
////        }
//
//        if( 0.3 * 1 == 0.3) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        /*
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(wordLengthMap);

         */
        List<String> words = Arrays.asList("hello", "world", "hello", "java");
        Map<String, Long> frequencyMap = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);

    }
}

