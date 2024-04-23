package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {
    @Test
    void returnFalseIfTheYearIsNotInRangeFrom1To9999() {
        boolean result = LeapYearCalculator.isLeapYear(-1600);
        assertEquals(false , result);
    }
    @Test
    void returnTrueIfTheThe1600IsALeapYear() {
        boolean result = LeapYearCalculator.isLeapYear(1600);;
        assertEquals(true , result);
    }
    @Test
    void returnFalseIfTheYear2017IsNotALeapYear() {
        boolean result = LeapYearCalculator.isLeapYear(2017);;
        assertEquals(false , result);
    }

    @Test
    void returnTrueIfTheYear2000IsNotALeapYear() {
        boolean result = LeapYearCalculator.isLeapYear(2000);;
        assertEquals(true , result);
    }

}