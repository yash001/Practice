/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSortExample {
    public static void main(String[] args) {
        // Step 3: Create a list of employees
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(101, "Alice", 24, 50000));
        employees.add(new Employee(102, "Alice", 24, 70000));
        employees.add(new Employee(103, "Bob", 30, 45000));
        employees.add(new Employee(104, "Bob", 30, 55000));
        employees.add(new Employee(105, "Catherine", 28, 70000));

       /*
        // Step 4: Sort employees by name, then by age, then by salary
       Collections.sort(employees,new Comparator<Employee>() {
    	   

		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			// Compare by name
            int nameCompare = e1.getName().compareTo(e2.getName());
            if (nameCompare != 0) {
                return nameCompare;
            }
            // If names are the same, compare by age*
            int ageCompare = Integer.compare(e2.getAge(), e1.getAge());
            if (ageCompare != 0) {
                return ageCompare;
            }
            // If age is the same, compare by salary
            return Double.compare(e2.getSalary(), e1.getSalary());
			
		}
       });
        // Step 5: Print the sorted list of employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        */
        
        
        // Sort employees by name, then by age, then by salary using java8 features
        
        //Collections.sort(employees,new Comparator<Employee>() {
     	   
        List<Employee> sortedEmployee = employees.stream()
        		.sorted(Comparator.comparing(Employee::getName)
        				  .thenComparing(Comparator.comparing(Employee::getAge).reversed())
        				  .thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
        		.collect(Collectors.toList());
 	  
         // Step 5: Print the sorted list of employees
        sortedEmployee.forEach(System.out::println);
    }
}

