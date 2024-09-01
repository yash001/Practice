/**
 * 
 */
package org.example.multi.classLoaders;

/**
 * 
 */
public class CustomClassLoaderTest {
    public static void main(String[] args) {
        try {
            // Create an instance of CustomClassLoader with the directory containing the class files
            //CustomClassLoader customClassLoader = new CustomClassLoader("./custom_classes");
            CustomClassLoader customClassLoader = 
            		new CustomClassLoader("D:\\preparation\\practise_code\\Practise\\src\\main\\java\\org\\example\\multi\\custom_classes");
           // C:\\path\\to\\custom_classes\\MyClass.class

            // Load the class (assumes the class is named "MyClass")
            Class<?> myClass = customClassLoader.loadClass("MyClass");

            // Create a new instance of the loaded class
            Object myObject = myClass.newInstance();

            // Optionally, call a method from the class (assumes there's a method called "sayHello")
            myClass.getMethod("sayHello").invoke(myObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

