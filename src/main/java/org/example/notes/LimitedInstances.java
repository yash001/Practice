/**
 * 
 */
package org.example.notes;

/**
 * How to write a class which can have only 3 instances in JVM 
 */
public class LimitedInstances {
    private static final int MAX_INSTANCES = 3; // Maximum number of instances
    private static int instanceCount = 0; // Track the number of created instances
    
    private static LimitedInstances[] instances = new LimitedInstances[MAX_INSTANCES]; // Array to store instances

    // Private constructor to prevent direct instantiation
    private LimitedInstances() {
        // Initialize any necessary fields here
    }

    // Static method to get an instance of the class
    public static LimitedInstances getInstance(int index) {
        if (index < 0 || index >= MAX_INSTANCES) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        if (instances[index] == null) {
            if (instanceCount < MAX_INSTANCES) {
                instances[index] = new LimitedInstances();
                instanceCount++;
            } else {
                throw new IllegalStateException("Cannot create more than " + MAX_INSTANCES + " instances");
            }
        }
        return instances[index];
    }

    // Optional: method to get the number of instances created
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Optional: method to get an instance by its index
    public static LimitedInstances getInstanceByIndex(int index) {
        if (index < 0 || index >= MAX_INSTANCES) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return instances[index];
    }

    public static void main(String[] args) {
        // Create instances using the getInstance method
        LimitedInstances obj1 = LimitedInstances.getInstance(0);
        LimitedInstances obj2 = LimitedInstances.getInstance(1);
        LimitedInstances obj3 = LimitedInstances.getInstance(2);

        System.out.println("Number of instances created: " + LimitedInstances.getInstanceCount());

        // Attempt to create a fourth instance (should throw an exception)
        try {
            LimitedInstances obj4 = LimitedInstances.getInstance(3); // This should throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

