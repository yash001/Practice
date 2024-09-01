/**
 * 
 */
package org.example.notes;

/**
 * 
 * Given an employee list, sort the list by firstname, lastname & dept name using stream api
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class EmployeeSortExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", "HR"));
        employees.add(new Employee("Jane", "Smith", "Finance"));
        employees.add(new Employee("John", "Smith", "IT"));
        employees.add(new Employee("Mary", "Johnson", "Finance"));
        employees.add(new Employee("Anna", "Doe", "HR"));

        // Sort the list by firstName, then lastName, then departmentName
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparing(Employee::getFirstName)
                              .thenComparing(Employee::getLastName)
                              .thenComparing(Employee::getDepartmentName))
            .collect(Collectors.toList());

        // Print the sorted list
        sortedEmployees.forEach(System.out::println);
    }
}

