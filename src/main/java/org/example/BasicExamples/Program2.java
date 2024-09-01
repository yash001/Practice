package org.example.BasicExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program2 {

    public static void main(String[] a) {

        String[] emplaoyeeSalaryMapping = { "Chris,2000", "David,4000", "Chris,3000", "Jon,1000", "Matt,200",

                "Chris,5000", "David,5000", "Jon,4000" };

        //Question : Find out People with average wages above a threshold
        Integer threshold = 3000;
        List<String> result = wagesAbove(Arrays.asList(emplaoyeeSalaryMapping), threshold);
        System.out.println(result); // Should print names of employees with average salary above the threshold
    }


    private static List<String> wagesAbove(List<String> employeeSalaryMappings, Integer threshold) {

        /*
        //TODO function definition using Java8 Streams

        return employeeSalaryMappings.stream()
                // Split each entry into a Map of employee -> List of salaries
                .map(s -> s.split(","))
                .collect(Collectors.groupingBy(
                        arr -> arr[0],
                        Collectors.mapping(
                                arr -> Integer.parseInt(arr[1]),
                                Collectors.toList()
                        )
                ))
                // Calculate average salary for each employee
                .entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0)
                ))
                // Filter employees with average salary above the threshold
                .entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                // Collect employee names into a List
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
         */
        return employeeSalaryMappings.stream()
                .map(s -> s.split(","))
                .collect(Collectors.groupingBy(
                arr -> arr[0],
                        Collectors.mapping(
                                arr -> Integer.parseInt((arr[1])),
                                Collectors.toList()
                        )
                ))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0)
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
