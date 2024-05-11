package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {
    @Test
    void returnTrueIfSumOfFirstAndSecondNumberAreEqualWithThirdNumber() {
        boolean result = EqualSumChecker.hasEqualSum(1, -1, 0);
        assertEquals(true , result);

         result = EqualSumChecker.hasEqualSum(1, 1, 2);
        assertEquals(true , result);
    }

    @Test
    void returnFalseIfSumOfFirstAndSecondNumberAreNotEqualWithThirdNumber() {
        boolean result = EqualSumChecker.hasEqualSum(1, 1, 1);
        assertEquals(false , result);

    }
}