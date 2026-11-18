package com.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void addsTwoPositiveNumbers() {
        int result = Calculator.add(4, 5);
        assertEquals(9, result);
    }

    @Test
    void addsTwoNegativeNumbers() {
        int result = Calculator.add(-4, -5);
        assertEquals(-9, result);
    }

    @Test
    void addsPositiveAndNegativeNumber() {
        int result = Calculator.add(4, -5);
        assertEquals(-1, result);
    }

    @Test 
    void addsZero() {
        int result = Calculator.add(0, 5);
        assertEquals(5, result);
    }
    
}
