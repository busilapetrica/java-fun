package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void returnTrueIfNumbersAreEqualsUpTo3Decimals() {
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        assertEquals(true , result);

        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        assertEquals(true , result);

    }

    @Test
    void returnFalseIfNumbersAreEqualsUpTo3Decimals() {
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        assertEquals(false , result);

        result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        assertEquals(false , result);

    }

}