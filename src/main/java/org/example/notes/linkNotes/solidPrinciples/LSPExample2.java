/**
 * 
 */
package org.example.notes.linkNotes.solidPrinciples;

/**
 * 
 */
class Bird1 {
    public void eat() {
        System.out.println("This bird is eating");
    }
}

class FlyingBird1 extends Bird1 {
    public void fly() {
        System.out.println("This bird is flying");
    }
}

class Penguin1 extends Bird1 {
    // Penguins do not fly, so no fly method here
}

class Sparrow1 extends FlyingBird1 {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class LSPExample2 {
    public static void main(String[] args) {
        FlyingBird1 sparrow = new Sparrow1();
        sparrow.fly(); // Sparrow is flying

        Bird1 penguin = new Penguin1();
        penguin.eat(); // This bird is eating

        // No fly method called on penguin, so no violation
    }
}

