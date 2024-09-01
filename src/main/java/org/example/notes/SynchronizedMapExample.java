/**
 * 
 */
package org.example.notes;

/**
 *
 synchronizedMap is a method provided by the Collections utility class in Java that returns a thread-safe version of a given Map. It wraps a regular Map with synchronized blocks, ensuring that all operations on the map are thread-safe by synchronizing on the entire map object. This means that only one thread can access the map at a time for operations like adding, removing, or updating entries, effectively preventing data inconsistencies in a multi-threaded environment.

How synchronizedMap Works:
Synchronized Wrapper: The Collections.synchronizedMap() method takes a Map as an argument and returns a new Map where each method is synchronized using the map instance itself as the lock.

Thread Safety: The returned Map ensures that all operations (e.g., put, get, remove, containsKey) are thread-safe, meaning that if multiple threads try to access or modify the map concurrently, only one thread will be allowed to perform an operation at a time.

Usage Example:
  
 Key Characteristics of synchronizedMap:
Thread Safety:

Every operation on the synchronizedMap is synchronized on the map instance itself. This guarantees that only one thread can perform an operation on the map at any given time.
Performance:

Since synchronizedMap locks the entire map for each operation, it can lead to performance bottlenecks in highly concurrent environments, as threads will have to wait for the lock to be released.
This is a simple way to ensure thread safety but not the most efficient for situations where there is high contention.
Manual Synchronization During Iteration:

When iterating over the synchronizedMap, you must manually synchronize on the map object to avoid ConcurrentModificationException:

 synchronized(syncMap) {
    for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
        // Safe iteration
    }
}

This is necessary because the iterator returned by the map is not thread-safe, even though the map itself is.
Use Case:

synchronizedMap is suitable for use cases where the number of threads accessing the map is relatively small, or where simplicity is more important than performance. For example, it might be used in legacy systems where replacing HashMap with more advanced concurrent collections is not feasible.


synchronizedMap vs. ConcurrentHashMap:
Lock Granularity:

synchronizedMap locks the entire map for every operation, leading to potential bottlenecks when multiple threads attempt to access the map concurrently.
ConcurrentHashMap, on the other hand, uses finer-grained locking (bucket-level or even no locking for read operations) to allow higher concurrency and better performance.
Performance:

ConcurrentHashMap is generally preferred in high-concurrency environments due to its better performance characteristics, as it allows multiple threads to operate on different parts of the map simultaneously.
synchronizedMap is simpler but less performant under heavy concurrent access.
Null Handling:

synchronizedMap behaves the same as the wrapped map regarding null keys and values. If the wrapped map allows null values, so will the synchronizedMap.
ConcurrentHashMap does not allow null keys or values to avoid ambiguity and potential issues in concurrent programming.
Summary:
synchronizedMap is a simple way to make a Map thread-safe by wrapping it with synchronized blocks. However, it locks the entire map for every operation, which can lead to performance issues in highly concurrent environments. For better performance with high concurrency, ConcurrentHashMap is generally a better choice.



 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
	
    public static void main(String[] args) {
        // Create a regular HashMap
        Map<String, Integer> map = new HashMap<>();

        // Create a synchronized version of the map
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);

        // Add entries to the synchronized map
        syncMap.put("One", 1);
        syncMap.put("Two", 2);
        syncMap.put("Three", 3);

        // Retrieve a value
        System.out.println("Value for 'Two': " + syncMap.get("Two"));

        // Example of iteration (must be synchronized manually)
        synchronized (syncMap) {
            for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
