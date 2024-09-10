/**
 * 
 */
package org.example.Exceptions;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
class FileHandler {
    private FileWriter writer;

    public FileHandler(String fileName) throws IOException {
        // Validate input before acquiring resources
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }

        // Acquire the resource (FileWriter)
        writer = new FileWriter(fileName);

        // Simulate an error after resource acquisition
        if (fileName.equals("error.txt")) {
            throw new IOException("Simulated error while opening the file.");
        }

        System.out.println("FileWriter for " + fileName + " initialized.");
    }

    public void writeData(String data) throws IOException {
        writer.write(data);
    }

    public void close() {
        if (writer != null) {
            try {
                writer.close();
                System.out.println("FileWriter closed.");
            } catch (IOException e) {
                System.err.println("Failed to close FileWriter: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("error.txt");  // Will throw an exception
            fileHandler.writeData("Hello, world!");
        } catch (Exception e) {
            System.err.println("Failed to handle file: " + e.getMessage());
        } finally {
            if (fileHandler != null) {
                fileHandler.close();  // Ensure resources are cleaned up
            }
        }
    }
}