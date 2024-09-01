/**
 * 
 */
package org.example.designPatterns.decorator;

/**
 * Write a decorator for function which return name and add functionality which print “Hi Name”
 */
public class DecoratorDesignPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Create a SimpleNameProvider with the original name
        NameProvider simpleName = new SimpleNameProvider("Alice");

        // Decorate it to add "Hi " prefix
        NameProvider decoratedName = new NameDecorator(simpleName);

        // Print the result
        System.out.println(decoratedName.getName()); // Output: "Hi Alice"
    }

}
