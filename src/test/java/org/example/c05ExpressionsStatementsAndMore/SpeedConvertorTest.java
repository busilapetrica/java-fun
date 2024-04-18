package org.example.c05ExpressionsStatementsAndMore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConvertorTest {
    @Test
    void returnRoundedKilometersPerHourConvertedFromMiles() {
        long result = SpeedConvertor.toMilesPerHour(1.5);
        assertEquals(1, result);

        result = SpeedConvertor.toMilesPerHour(10.25);
        assertEquals(6, result);

        result = SpeedConvertor.toMilesPerHour(25.42);
        assertEquals(16, result);

        result = SpeedConvertor.toMilesPerHour(75.114);
        assertEquals(47, result);

    }

    @Test
    void returnMinusOneIfGivenMilesAreNegativeNumber() {
        long result = SpeedConvertor.toMilesPerHour(-5.6);
        assertEquals(-1, result);
    }
}