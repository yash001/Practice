/**
 * 
 */
package org.example.notes;

/**
 * Now I have an Employee class and I want to put this Employee class object as a key in HashMap,
	what changes need to be done?
Cross Question on above: What if we override only hashCode() and not override equals()?
 */
import java.util.HashSet;

public class HashCodeEqualsDemo {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Only hashCode() is overridden
        @Override
        public int hashCode() {
            return name.hashCode() + age;
        }

        // equals() is not overridden, so it uses the default implementation from Object
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        // Display the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
        
        // Check if the set contains the objects
        System.out.println("Set contains p1: " + set.contains(p1));
        System.out.println("Set contains p2: " + set.contains(p2));
    }
}

