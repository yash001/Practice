/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 * The Prototype design pattern is a creational design pattern that focuses on creating new objects by copying an existing object (known as the prototype). This pattern is useful when creating an instance of a class is more expensive or complex than copying an existing instance.

Key Concepts of Prototype Design Pattern
Prototype Interface: This interface declares a method for cloning itself. In Java, this is typically represented using the Cloneable interface and the clone() method.

Concrete Prototype: This class implements the Prototype interface and provides the actual implementation of the cloning method.

Client: The client uses the Prototype instance to create new objects by cloning the prototype rather than creating new instances from scratch.

Benefits
Performance: Cloning can be more efficient than creating a new object from scratch, especially if object creation is complex.
Flexibility: Allows dynamic creation of objects with varying configurations by modifying prototypes.
How to Implement Prototype Design Pattern in Java
Here's a step-by-step guide to implementing the Prototype design pattern in Java:

Create the Prototype Interface

Define an interface that declares the clone() method.

 */
public class PrototypeDemo {
    public static void main(String[] args) {
        // Create an instance of ConcretePrototype
        ConcretePrototypePatternPrototype original = new ConcretePrototypePatternPrototype("Original Data");

        // Clone the original instance
        ConcretePrototypePatternPrototype cloned = (ConcretePrototypePatternPrototype) original.clone();

        // Display both original and cloned instances
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        // Modify the cloned instance
        cloned.setData("Cloned Data");

        // Display modified instances
        System.out.println("After modification:");
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}

