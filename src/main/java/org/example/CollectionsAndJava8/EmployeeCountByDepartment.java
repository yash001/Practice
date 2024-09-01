/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private String department;

    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class EmployeeCountByDepartment {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "Engineering"),
            new Employee1("Bob", "Sales"),
            new Employee1("Carol", "Engineering"),
            new Employee1("Dave", "Marketing"),
            new Employee1("Eve", "Sales")
        );

        LinkedHashMap<String, Long> departmentCounts = employees.stream()
            .collect(Collectors.groupingBy(Employee1::getDepartment, LinkedHashMap::new,Collectors.counting()));

        departmentCounts.forEach((department, count) -> 
            System.out.println(department + ": " + count));
    }
}

