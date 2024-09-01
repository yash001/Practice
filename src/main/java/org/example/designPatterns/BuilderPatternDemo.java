/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 * Builder Design Pattern
The Builder design pattern is a creational design pattern that provides a way to construct complex objects step by step. Unlike other creational patterns, which build objects in a single step, the Builder pattern allows for greater control over the construction process. This is particularly useful when an object can be created in multiple ways or when its construction requires multiple steps.

Key Concepts of Builder Design Pattern
Builder Interface: Defines the steps to construct the object. Each step typically returns the builder itself to allow method chaining.

Concrete Builder: Implements the builder interface to construct and assemble parts of the product.

Director: An optional class that defines the order in which to call the builder's construction steps, effectively directing the building process.

Product: The complex object that is being constructed.

Benefits
Control: Provides fine-grained control over the construction process.
Flexibility: Allows for the creation of different representations of a complex object.
Readability: Method chaining makes the code more readable and easier to understand.
How to Implement Builder Design Pattern in Java
Here’s a step-by-step guide to implementing the Builder design pattern in Java:

Define the Product

Define the class of the object that you want to build.

Builder Design Pattern
The Builder design pattern is a creational design pattern that provides a way to construct complex objects step by step. Unlike other creational patterns, which build objects in a single step, the Builder pattern allows for greater control over the construction process. This is particularly useful when an object can be created in multiple ways or when its construction requires multiple steps.

Key Concepts of Builder Design Pattern
Builder Interface: Defines the steps to construct the object. Each step typically returns the builder itself to allow method chaining.

Concrete Builder: Implements the builder interface to construct and assemble parts of the product.

Director: An optional class that defines the order in which to call the builder's construction steps, effectively directing the building process.

Product: The complex object that is being constructed.

Benefits
Control: Provides fine-grained control over the construction process.
Flexibility: Allows for the creation of different representations of a complex object.
Readability: Method chaining makes the code more readable and easier to understand.
How to Implement Builder Design Pattern in Java
Here’s a step-by-step guide to implementing the Builder design pattern in Java:

1Define the Product

Define the class of the object that you want to build.

2 Use the Builder to Construct the Object

In the client code, use the builder to construct the product.

Explanation
Product: The Product class represents the complex object that is being constructed. It has multiple parts (e.g., partA, partB, partC).
Builder: The Builder class is a static nested class within Product. It provides methods to set each part of the product and a build() method to create the final Product object.
Client: The client code (BuilderPatternDemo) uses the builder to create an instance of Product.
The Builder pattern is particularly useful when an object requires a lot of configuration before it can be constructed. It simplifies the process of constructing complex objects and makes the code more readable and maintainable.


 * 
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Using the builder to construct the product
        Product product = new Product.Builder()
            .setPartA("Part A")
            .setPartB("Part B")
            .setPartC("Part C")
            .build();

        // Display the product
        System.out.println(product);
    }
}

