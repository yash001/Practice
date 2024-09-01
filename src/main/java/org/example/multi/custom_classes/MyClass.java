/**
 * 
 */
package org.example.multi.custom_classes;

/**
 * 
 */
public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		System.out.println(myclass.sayHello());
	}
	public String sayHello() {
		//System.out.println("Current working directory: " + System.getProperty("user.dir"));
		return "Inside : sayHello() method of class : MyClass";
	}

}
