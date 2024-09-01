/**
 * 
 */
package org.example.customFunctionality;

/**
 * A generator is a special type of function or method that allows you to iterate over a sequence of values without storing them in memory all at once. Generators are a useful tool for handling large datasets or streams of data where generating all the data at once would be inefficient or impractical. They are often used in scenarios where you need to lazily produce values, meaning you generate each value on the fly as needed, rather than generating all values upfront.

Characteristics of Generators
Lazy Evaluation: Generators produce items one at a time and only when required. This is known as lazy evaluation, and it makes generators very memory-efficient.

Statefulness: Generators maintain their state between successive calls. This means that they can remember where they left off in the sequence, which is particularly useful for iterating through large datasets.

Use of yield: In languages like Python, generators are created using the yield keyword instead of return. Each time the generator's __next__() method is called, the generator function resumes where it left off, continues until it hits the next yield, and then returns the yielded value.

Iterable: Generators are iterables, meaning you can use them in loops or with functions that consume iterables (e.g., for loops, list comprehensions).

Generators in Java
Java does not have built-in support for generator functions like Python does, but you can implement similar behavior using Iterable and Iterator interfaces, or by using streams in Java 8 and above.

Example of a Simple Generator in Python
Here's an example in Python to illustrate how generators work:


 * 
 */
import java.util.Iterator;

public class SimpleGenerator implements Iterator<Integer> {

    private int current = 1;

    @Override
    public boolean hasNext() {
        return current <= 3;
    }

    @Override
    public Integer next() {
        return current++;
    }

    public static void main(String[] args) {
        SimpleGenerator generator = new SimpleGenerator();

        while (generator.hasNext()) {
            System.out.println(generator.next());
        }
    }
}

