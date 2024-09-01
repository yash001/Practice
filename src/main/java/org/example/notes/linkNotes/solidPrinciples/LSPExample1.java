/**
 * 
 */
package org.example.notes.linkNotes.solidPrinciples;

/**
 * 
 */
class Bird {
    public void eat() {
        System.out.println("This bird is eating");
    }
}

class FlyingBird extends Bird {
    public void fly() {
        System.out.println("This bird is flying");
    }
}

class Penguin extends Bird {
    // Penguins do not fly, so no fly method here
}

class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class LSPExample1 {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); // Sparrow is flying

        Bird penguin = new Penguin();
        penguin.eat(); // This bird is eating

        // No fly method called on penguin, so no violation
    }
}

