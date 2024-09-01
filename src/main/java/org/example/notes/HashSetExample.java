/**
 * 
 */
package org.example.notes;

/**
 A HashSet is a collection class in Java that implements the Set interface, backed by a hash table (specifically, an instance of HashMap). It is used to store unique elements, meaning it does not allow duplicate entries. The elements in a HashSet are not ordered, and the HashSet does not maintain the insertion order of the elements.

Key Characteristics of HashSet:
Unique Elements:

HashSet only stores unique elements. If you try to add a duplicate element (an element that is equal to an existing one according to the equals() method), the set will not allow the insertion, and the size of the set will remain unchanged.
No Order Guarantee:

HashSet does not guarantee any specific order of the elements. The elements may appear in any order depending on the hash codes and the internal structure of the hash table.
Null Values:

HashSet allows one null element because a set can only contain one instance of any object, and null is treated as a unique value.
Internal Implementation:

Internally, HashSet uses a HashMap to store its elements. Each element added to the HashSet is stored as a key in the underlying HashMap, with a constant dummy value.
Time Complexity:

Basic operations like add, remove, contains, and size have an average time complexity of O(1) due to the underlying hash table.
What Happens When Inserting the Same Object into a HashSet:
When you attempt to insert an object that is already in the HashSet, the set will not add the duplicate object. The HashSet relies on the hashCode() and equals() methods to determine if an object is already present:

hashCode() Check:

When an object is inserted, the HashSet computes its hashCode() to determine the appropriate bucket where the object should be placed.
equals() Check:

If the bucket where the object should be placed already contains other objects (i.e., hash collisions), the HashSet will use the equals() method to check if the object is equal to any existing object in that bucket.
If the Object is Found:

If hashCode() returns a value that matches an existing object in the same bucket, and equals() returns true (indicating the objects are identical), the HashSet will not add the new object because it is considered a duplicate.
If the Object is Not Found:

If neither hashCode() nor equals() find a match, the object is added to the set.


 */
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Attempt to add a duplicate element
        boolean added = set.add("Apple"); // This will return false

        // Checking the contents of the HashSet
        System.out.println("HashSet contains: " + set); // Output will be [Banana, Apple, Orange]
        System.out.println("Was 'Apple' added again? " + added); // Output will be false
        System.out.println("HashSet size: " + set.size()); // Output will be 3
    }
}
