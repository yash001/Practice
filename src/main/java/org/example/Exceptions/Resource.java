/**
 * 
 */
package org.example.Exceptions;

/**
 * 
 */
class Resource {
    private String resourceName;

    // Constructor throwing an unchecked exception
    public Resource(String resourceName) {
        if (resourceName == null || resourceName.isEmpty()) {
            throw new IllegalArgumentException("Resource name cannot be null or empty");
        }
        this.resourceName = resourceName;
        System.out.println("Resource " + resourceName + " initialized.");
    }

    public static void main(String[] args) {
        try {
            // Creating a valid resource
            Resource validResource = new Resource("ValidResource");

            // Attempting to create a resource with invalid input
            Resource invalidResource = new Resource("");
        } catch (IllegalArgumentException e) {
            // Handling unchecked exception thrown by constructor
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}

