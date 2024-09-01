/**
 * 
 */
package org.example.notes;

/**
 * 
 */
public class Employee1 {
    private String firstName;
    private String lastName;
    private int age;
    private String mobileNumber;

    // Constructor
    public Employee1(String firstName, String lastName, int age, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}

