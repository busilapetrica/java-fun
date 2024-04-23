package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void returnTrueIfDogBarkingAtHourBefore8AndAfter22() {
        boolean result = BarkingDog.shouldWakeUp(true, 1);
        assertEquals(true , result);
    }
    @Test
    void returnFalseIfDogIsNotBarking() {
        boolean result = BarkingDog.shouldWakeUp(false, 1);
        assertEquals(false , result);
    }

    @Test
    void returnFalseIfDogIsNotBarkingBefore8() {
        boolean result = BarkingDog.shouldWakeUp(true, 8);
        assertEquals(false , result);
    }

    @Test
    void returnFalseIfHourIsNotInInterval0and23() {
        boolean result = BarkingDog.shouldWakeUp(false, -1);
        assertEquals(false , result);
    }

}