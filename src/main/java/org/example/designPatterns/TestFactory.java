/**
 * 
 */
package org.example.designPatterns;

/**
 * The factory pattern takes out the responsibility of instantiating a object from the class to a Factory class.
 */
public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}


}
