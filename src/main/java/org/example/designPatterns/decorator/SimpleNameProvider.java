/**
 * 
 */
package org.example.designPatterns.decorator;

/**
 * 
 */
public class SimpleNameProvider implements NameProvider {
    private String name;

    public SimpleNameProvider(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

