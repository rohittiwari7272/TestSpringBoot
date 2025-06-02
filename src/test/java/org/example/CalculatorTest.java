package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        int result = calculator.add(1,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    void substract() {
    }

    @Test
    void multiply() {
    }
}