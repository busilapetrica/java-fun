package org.example.c05ExpressionsStatementsAndMore;

public class SpeedConvertor {

    private SpeedConvertor() {
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        double kilometersToMiles;
        double kilometer =  0.621371;

        if (kilometersPerHour < 0) {
            kilometersToMiles = -1;
        } else {
            kilometersToMiles = kilometersPerHour * kilometer;
        }
        return Math.round(kilometersToMiles);
    }



}
