package io.example.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonGenericSquareTest {

    @Test
    public void test() {
        NonGenericSquare nonGenericSquare = new NonGenericSquare();
        nonGenericSquare.setLength(100);
        int value = (int) nonGenericSquare.getLength();  //Type Casting used
        Assertions.assertEquals(100, value);
    }
}
