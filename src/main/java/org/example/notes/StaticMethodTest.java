/**
 * 
 */
package org.example.notes;

/**
 * 
 */
class Parent {
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Static method in Child class");
    }
}



public class StaticMethodTest {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Parent parent = new Parent();
	        Parent childAsParent = new Child();
	        Child child = new Child();

	        parent.display();          // Outputs: Static method in Parent class
	        childAsParent.display();   // Outputs: Static method in Parent class (method hiding)
	        child.display();           // Outputs: Static method in Child class
	    }

}
