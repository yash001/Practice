/**
 * 
 */
package org.example.notes;

/**
 ConcurrentHashMap is a thread-safe implementation of the Map interface in Java. It is designed to handle concurrency scenarios where multiple threads might need to read from and write to the map simultaneously. Unlike HashMap, which is not synchronized and thus not thread-safe, ConcurrentHashMap allows safe and efficient access by multiple threads without requiring the entire map to be locked.

Key Features of ConcurrentHashMap:
Thread Safety:

ConcurrentHashMap is designed for concurrent access, meaning that multiple threads can safely interact with the map without causing data inconsistencies or corruption.
Unlike using a HashMap with Collections.synchronizedMap, which locks the entire map for every operation, ConcurrentHashMap only locks portions of the map, allowing for higher concurrency and better performance.
Locking Mechanism:

Segmented Locking: In the earlier versions (Java 7 and before), ConcurrentHashMap used a technique called segmented locking, where the map was divided into segments, and each segment could be locked independently. This allowed multiple threads to operate on different segments simultaneously without interference.
Lock Stripping: In Java 8 and later, the implementation was changed to use lock stripping, where individual buckets (or groups of buckets) are locked as needed. This further improves concurrency by reducing the contention between threads.
No null Keys or Values:

ConcurrentHashMap does not allow null keys or values. This is to prevent ambiguity when checking for the presence of a key and to avoid potential pitfalls in concurrent programming where null might be used to represent both "not present" and "not yet initialized."
Concurrent Iteration:

Iterators returned by ConcurrentHashMap are designed to be weakly consistent. This means that they reflect the state of the map at the time of their creation, but they may not throw ConcurrentModificationException if the map is modified during iteration. Instead, they may reflect some (or all) of the changes made after the iterator was created.
Performance:

ConcurrentHashMap provides better performance in multi-threaded environments compared to using a synchronized block with a regular HashMap or using Collections.synchronizedMap.
The operations like get(), put(), remove(), etc., are performed without blocking the entire map, allowing for higher throughput.
Atomic Operations:

ConcurrentHashMap provides several atomic methods, such as putIfAbsent(), remove(), replace(), etc., which allow atomic updates to the map without requiring explicit synchronization by the developer.
Time Complexity:

The time complexity for basic operations such as get(), put(), and remove() is O(1) in the average case, similar to HashMap, but with additional overhead due to the need for thread safety.
Example Usage:

When to Use ConcurrentHashMap:
High-Concurrency Environments: When you have multiple threads performing read and write operations on a shared map, ConcurrentHashMap is the preferred choice due to its ability to handle such operations efficiently.

Scalability: If your application needs to scale with the number of threads, using ConcurrentHashMap can help avoid bottlenecks that occur with more traditional synchronized maps.
Avoiding null Values: If your application logic can be confused by null keys or values, ConcurrentHashMap prevents their usage, which can help prevent bugs.
In summary, ConcurrentHashMap is a powerful tool for managing concurrent access to a map in a multi-threaded environment, offering both thread safety and high performance.

 */
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add entries to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieve a value
        System.out.println("Value for 'Two': " + map.get("Two"));

        // Atomic operation - putIfAbsent
        map.putIfAbsent("Four", 4);

        // Iterate over the map
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
