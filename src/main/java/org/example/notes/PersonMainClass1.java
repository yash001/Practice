/**
 * 
 */
package org.example.notes;

/**
 * Cross Question on above: What if we override only equals() and not override hashCode()?
 */
import java.util.HashMap;
import java.util.Map;

class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return name != null ? name.equals(person1.name) : person1.name == null;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

    // hashCode() is not overridden
}

public class PersonMainClass1 {
    public static void main(String[] args) {
        Map<Person1, String> map = new HashMap<>();
        Person1 p1 = new Person1("Alice");
        Person1 p2 = new Person1("Alice");
        
        p1.setName("Alice");
        
        map.put(p1, "Engineer");
        map.put(p2, "CA");
        
        System.out.println("map size: " + map.size()); // Expected size: 1
        
        // Attempt to retrieve using a logically equal object but with default hashCode
        Person1 key = new Person1("Alice");
        System.out.println("Value: " + map.get(p1.getName())); // Might return null
        System.out.println("Value: " + map.get(key)); // Might return null
        
        
        // equals
        System.out.println("Is Person P1 equals to P2 : " + p1.equals(p2));
    }
}
