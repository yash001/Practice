/**
 * 
 */
package org.example.notes;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 3. Implement LRU cache with optimal time complexity
 * 
 * Explanation:
LRUCache Class: Implements the LRU cache using a combination of a HashMap for O(1) access and a doubly linked list to maintain the order of elements from most recently used 
to least recently used.
put(K key, V value) Method: Adds a key-value pair to the cache. If the cache exceeds its capacity, the least recently used entry is removed.
get(K key) Method: Retrieves the value associated with the key from the cache and moves the accessed entry to the front of the list, indicating it was recently used.
Test Case Execution:
The main method provides sample test data and prints the results of cache operations.

Initially, the cache is populated with three entries: (1, "One"), (2, "Two"), and (3, "Three").
Accessing the key 1 brings it to the front (most recently used).
Adding a fourth entry (4, "Four") evicts the least recently used key 2.
Continuing this process, adding more entries demonstrates the eviction of the least recently used entries.

// Get the value from the cache
public V get(K key)
// Put a key-value pair into the cache
public void put(K key, V value)
// Add a new node at the head (most recently used)
private void addNode(Node node)
// Remove a node from the list
private void removeNode(Node node)
// Move a node to the head (most recently used)
private void moveToHead(Node node)
// Pop the tail node (least recently used)
private Node popTail()
 * 
 */
import java.util.HashMap;
import java.util.Map;

class LRUCache<K, V> {

    // Node class for the doubly linked list
    private class Node {
        K key;
        V value;
        Node prev;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<K, Node> cache;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
    }

    // Get the value from the cache
    public V get(K key) {
        Node node = cache.get(key);
        if (node == null) {
            return null; // Key not found
        }
        // Move accessed node to the front (most recently used)
        moveToHead(node);
        return node.value;
    }

    // Put a key-value pair into the cache
    public void put(K key, V value) {
        Node node = cache.get(key);
        if (node == null) {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addNode(newNode);

            if (cache.size() > capacity) {
                // Remove the least recently used item
                Node tail = popTail();
                cache.remove(tail.key);
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    // Add a new node at the head (most recently used)
    private void addNode(Node node) {
        node.prev = null;
        node.next = head;

        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node;
        }
    }

    // Remove a node from the list
    private void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }

        if (next != null) {
            next.prev = prev;
        } else {
            tail = prev;
        }
    }

    // Move a node to the head (most recently used)
    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    // Pop the tail node (least recently used)
    private Node popTail() {
        Node res = tail;
        removeNode(tail);
        return res;
    }
}

public class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        // Adding some entries to the cache
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");

        // Accessing elements
        System.out.println("Get 1: " + lruCache.get(1)); // Output: One
        lruCache.put(4, "Four"); // This will remove key 2 ("Two") as it's the least recently used

        // Test data and expected results
        System.out.println("Get 2: " + lruCache.get(2)); // Output: null (2 has been evicted)
        System.out.println("Get 3: " + lruCache.get(3)); // Output: Three
        System.out.println("Get 4: " + lruCache.get(4)); // Output: Four

        // Adding another entry
        lruCache.put(5, "Five"); // This will remove key 1 ("One")

        System.out.println("Get 1: " + lruCache.get(1)); // Output: null (1 has been evicted)
        System.out.println("Get 3: " + lruCache.get(3)); // Output: Three
        System.out.println("Get 5: " + lruCache.get(5)); // Output: Five
    }
}
