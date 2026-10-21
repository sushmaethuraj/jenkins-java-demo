
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }
}
