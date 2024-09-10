/**
 * 
 */
package org.example.notes;

/**
 * 
 */
import java.util.*;
import java.util.stream.Collectors;

class Employee2 {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}



public class EmployeeGroupBySalary {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        // Sample Employee List
	        List<Employee2> employees = Arrays.asList(
	                new Employee2(1, "John", 12000),
	                new Employee2(2, "Jane", 9000),
	                new Employee2(3, "Tom", 15000),
	                new Employee2(4, "Jerry", 12000),
	                new Employee2(5, "Lucy", 9000)
	        );

	        // Grouping employees by salary
	        Map<Double, List<Employee2>> employeesBySalary = employees.stream()
	                .collect(Collectors.groupingBy(Employee2::getSalary));

	        // Output the result
	        employeesBySalary.forEach((salary, empList) -> {
	            System.out.println("Salary: " + salary);
	            empList.forEach(System.out::println);
	            System.out.println();
	        });
	    }

}
