/**
 * 
 */
package org.example.notes;

/**
 * Cross Question on above: What if we override only equals() and not override hashCode()?
 */
import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person Person = (Person) o;
        return name != null ? name.equals(Person.name) : Person.name == null;
    }

    // Note: hashCode() is not overridden
}

public class PersonMainClass {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");
        set.add(p1);
        set.add(p2); // Attempt to add a duplicate
       
        System.out.println("Set size: " + set.size()); // Expected size: 1
        System.out.println("p1 == p2: " + p1.equals(p2));
    }
}

