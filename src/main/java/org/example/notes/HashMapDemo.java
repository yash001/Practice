/**
 * 
 */
package org.example.notes;

/**
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static class Employee {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Only hashCode() is overridden
        @Override
        public int hashCode() {
            return name.hashCode() + id;
        }

        // equals() is not overridden, so it uses the default implementation from Object
    }

    public static void main(String[] args) {
        // Create a HashMap with Employee objects as keys
        Map<Employee, String> employeeMap = new HashMap<>();
        
        // Create two Employee objects with the same name and id
        Employee e1 = new Employee("Alice", 1);
        Employee e2 = new Employee("Alice", 1);

        // Put the Employee objects into the HashMap
        employeeMap.put(e1, "Employee 1");
        employeeMap.put(e2, "Employee 2");

        // Retrieve values using both Employee objects
        System.out.println("Value for e1: " + employeeMap.get(e1));
        System.out.println("Value for e2: " + employeeMap.get(e2));
        
        // Check if the map contains the Employee objects
        System.out.println("Map contains e1: " + employeeMap.containsKey(e1));
        System.out.println("Map contains e2: " + employeeMap.containsKey(e2));
        
        // Print the size of the HashMap
        System.out.println("Size of HashMap: " + employeeMap.size());
    }
}

