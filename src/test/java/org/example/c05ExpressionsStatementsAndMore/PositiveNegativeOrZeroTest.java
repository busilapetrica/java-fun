package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositiveNegativeOrZeroTest {
    @Test
    void returnPositiveIfNumberIsGreaterThen0() {
        String result = PositiveNegativeOrZero.checkNumber(3);
        assertEquals("positive" , result);
    }

    @Test
    void returnNegativeIfNumberIsLessThan0() {
        String result = PositiveNegativeOrZero.checkNumber(-3);
        assertEquals("negative" , result);
    }

    @Test
    void returnZeroIfNumberIsEqualsWith0() {
        String result = PositiveNegativeOrZero.checkNumber(0);
        assertEquals("zero" , result);
    }
}