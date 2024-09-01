package org.example.notes;

/*
 * Given a list of Employee class object, find/ fetch only employee mobile number whose age > 30
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FetchMobileNumbersExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", "Doe", 28, "123-456-7890"));
        employees.add(new Employee1("Jane", "Smith", 35, "234-567-8901"));
        employees.add(new Employee1("Alice", "Johnson", 45, "345-678-9012"));
        employees.add(new Employee1("Bob", "Brown", 29, "456-789-0123"));

        // Fetch mobile numbers of employees whose age is greater than 30
        List<String> mobileNumbers = employees.stream()
                                              .filter(e -> e.getAge() > 30) // Filter employees older than 30
                                              .map(Employee1::getMobileNumber) // Map to mobile number
                                              .collect(Collectors.toList()); // Collect into a list

        // Print the mobile numbers
        System.out.println("Mobile numbers of employees older than 30: " + mobileNumbers);
    }
}
