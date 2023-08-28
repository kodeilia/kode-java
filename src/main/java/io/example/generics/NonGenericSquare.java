package io.example.generics;

/**
 * Non-Generic version of the Shape class.
 * <p>
 * Object is used as type of the value
 */
public class NonGenericSquare {
    private Object length;

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }
}
