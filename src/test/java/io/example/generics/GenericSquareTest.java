package io.example.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericSquareTest {

    @Test
    public void test() {
        /*
         * Using Generic class as raw-type
         */
        GenericSquare genericSquare = new GenericSquare();
        genericSquare.setLength(100);
        int value = (int) genericSquare.getLength();  // Type Casting used
        Assertions.assertEquals(100, value);

        GenericSquare<Integer> genericSquare1 = new GenericSquare<>();
        genericSquare1.setLength(200);
        Assertions.assertEquals(200, genericSquare1.getLength()); // No Type Casting used

    }
}
