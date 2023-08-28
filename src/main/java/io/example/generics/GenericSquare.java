package io.example.generics;

/**
 * Generic version of the Shape class.
 *
 * @param <T> the type of the value being boxed
 */

public class GenericSquare<T> {
    private T length;

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }
}
