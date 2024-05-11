package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {
    @Test
    void returnTrueIfTheOneOfAgesAreBetween12And20() {
        boolean result = TeenNumberChecker.hasTeen(9, 99, 19);
        assertEquals(true, result);

        result = TeenNumberChecker.hasTeen(23, 15, 42);
        assertEquals(true, result);
    }

@Test
    void returnFalseIfNoneOfAgesAreNotBetween12And20() {
        boolean result = TeenNumberChecker.hasTeen(22, 23, 34);
        assertEquals(false, result);

    }
}