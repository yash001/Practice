/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {
        // Example birthday
        LocalDate birthday = LocalDate.of(1990, 5, 15); // YYYY, MM, DD

        // Calculate and print the age
        int age = calculateAge(birthday);
        System.out.println("Age: " + age + " years");
    }

    public static int calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();  // Get the current date
        if (birthday != null) {
            return Period.between(birthday, today).getYears();  // Calculate the period between the birthday and today, and get the number of years
        } else {
            throw new IllegalArgumentException("Birthday cannot be null");
        }
    }
}

