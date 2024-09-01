/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    // Private constructor
    private Product(Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }

    @Override
    public String toString() {
        return "Product [partA=" + partA + ", partB=" + partB + ", partC=" + partC + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String partA;
        private String partB;
        private String partC;

        public Builder setPartA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder setPartB(String partB) {
            this.partB = partB;
            return this;
        }

        public Builder setPartC(String partC) {
            this.partC = partC;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
