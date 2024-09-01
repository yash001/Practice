package org.example.designPatterns;

public class ConcretePrototypePatternPrototype implements Prototype {
    private String data;

    public ConcretePrototypePatternPrototype(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototype { data='" + data + "' }";
    }
}

