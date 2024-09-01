/**
 * 
 */
package org.example.notes;

/**
 * 
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String departmentName;

    // Constructor
    public Employee(String firstName, String lastName, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}


