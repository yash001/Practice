/**
 * 
 */
package org.example.designPatterns.decorator;

/**
 * 
 */
public class NameDecorator implements NameProvider {
    private NameProvider nameProvider;

    public NameDecorator(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    @Override
    public String getName() {
        // Retrieve the original name and add the "Hi " prefix
        return "Hi " + nameProvider.getName();
    }
}
