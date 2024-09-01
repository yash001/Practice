/**
 * 
 */
package org.example.notes;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Implement Singleton - a flawless thread-safe covering all edge cases.
 */
public final class Singleton implements Serializable, Cloneable {

    // Volatile variable to ensure visibility of changes to _instance across threads
    private static volatile Singleton _instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Prevent reflection from breaking the Singleton pattern
        if (_instance != null) {
            throw new IllegalStateException("Cannot create a new instance, use getInstance() method.");
        }
    }

    // Double-checked locking for lazy initialization and thread safety
    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    // Protect against serialization breaking Singleton
    private Object readResolve() throws ObjectStreamException {
        return _instance;
    }

    // Protect against cloning breaking Singleton
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone a Singleton object");
    }
}

	
