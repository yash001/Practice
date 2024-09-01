/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person(1, "John", 25),
            new Person(2, "Jane", 35),
            new Person(3, "Doe", 50),
            new Person(4, "Smith", 29)
        );

        // 1. Maximum age -> return person's name
        String maxAgePersonName = persons.stream()
            .max(Comparator.comparingInt(Person::getAge))
            .map(Person::getName)
            .orElse("No persons available");
        
        System.out.println("Person with maximum age: " + maxAgePersonName);

        /*
        // 2. Age greater than 30 -> return list of persons
        List<Person> personsAbove30 = persons.stream()
            .filter(p -> p.getAge() > 30)
            .collect(Collectors.toList());
        
        System.out.println("Persons with age greater than 30: " + personsAbove30.stream()
            .map(Person::getName)
            .collect(Collectors.joining(", ")));
        */
      

        // 3. Sum of age -> return sum
        int sumOfAges = persons.stream()
            .mapToInt(Person::getAge)
            .sum();
        
        System.out.println("Sum of ages: " + sumOfAges);
    }
}
