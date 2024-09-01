/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 * 
 * The Template Method design pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method, deferring some steps to subclasses. This pattern allows subclasses to redefine certain steps of an algorithm without changing the algorithm's overall structure. It promotes code reuse by letting common code be placed in a base class, while subclasses provide specific implementations for some parts of the algorithm.

Key Concepts of Template Method Design Pattern
Template Method: A method in a base class that defines the sequence of steps in the algorithm. Some of these steps are implemented in the base class, while others are abstract methods to be implemented by subclasses.

Abstract Methods: Methods that are declared but not implemented in the base class. Subclasses must provide the implementation for these methods.

Concrete Methods: Methods that are fully implemented in the base class and are common to all subclasses.

Hooks (Optional): Methods in the base class that are defined with a default (often empty) implementation. Subclasses can override these methods, but they are not required to.

Benefits
Code Reusability: Promotes reuse of common code in the base class.
Inversion of Control: Subclasses dictate how certain steps of the algorithm are implemented.
Consistency: Ensures that the overall structure of the algorithm remains consistent across different implementations.
Example in Java
Let’s implement the Template Method pattern with an example of making different types of beverages (e.g., tea and coffee).

1. Define the Abstract Class

The abstract class defines the template method and some of the steps that are common to all beverages.

2. Create Concrete Classes

Subclasses implement the steps that are specific to each type of beverage.
 
3. Use the Template Method

The client code uses the template method to prepare different beverages.

Explanation
Template Method (prepareRecipe): This method defines the algorithm's structure. It calls other methods (boilWater, brew, pourInCup, addCondiments) in a specific order.
Abstract Methods (brew, addCondiments): These are steps of the algorithm that vary between different types of beverages. They are defined in the base class as abstract methods and are implemented in the subclasses.
Concrete Methods (boilWater, pourInCup): These steps are common to all beverages and are implemented in the base class.
Advantages
Promotes code reuse by placing the invariant parts of the algorithm in the base class.
Encapsulates varying behavior in subclasses, keeping the overall algorithm structure intact.
Easier to maintain and extend since the algorithm structure is defined in one place.
Summary
The Template Method pattern is ideal for scenarios where you have multiple classes that need to implement variations of the same algorithm. It provides a consistent structure for the algorithm while allowing subclasses to customize specific steps. This pattern is widely used in frameworks and libraries where common algorithms are provided, and users are expected to extend or customize specific parts of the process.


 
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
