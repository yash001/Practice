/**
 * 
 */
package org.example.BasicExamples;

/**
 * 
 */
class Car {
	Car(String name) {
		System.out.println("Inside Car : ");
	}
	public static void drive() {
		System.out.println("Inside Car drive : ");
	}
	public  void drive1() {
		System.out.println("Inside Car drive1 : ");
	}
}


class BMD extends Car{
	BMD() {
		this("BMD");
		System.out.println("Inside BMD Car 1 : ");
	}
	BMD(String name) {
		super(name);
		System.out.println("Inside BMD Car 2 : ");
	}
	public static void drive() {
		System.out.println("Inside BMW Car drive : ");
	}
	public  void drive1() {
		System.out.println("Inside BMD Car drive1 : ");
	}
}


public class Example15 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new BMD();
		car.drive();
		System.out.println("after car object ");
		Car car1 = new BMD();
		car1.drive1();
		
	}

}
