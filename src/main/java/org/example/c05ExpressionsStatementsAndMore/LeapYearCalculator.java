package org.example.c05ExpressionsStatementsAndMore;

/**************************
 the year is a leap year and return true if it is a leap year, otherwise return false.

 To determine whether a year is a leap year, follow these steps:
 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
 4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
 * *************************/
public class LeapYearCalculator {
    private LeapYearCalculator() {
    }
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year > 1 && year < 9999) {
            //step 1 year is evenly divisible by 4
            if (year % 4 == 0) {
                //step 2 year is leap year if is not divisible by 100
                if (year % 100 == 0) {
                    //year is leap year if is divisible by 400
                    if (year % 400 == 0) {
                        leapYear = true;
                    }
                } else {
                // step 4 The year is a leap year if is not divisible by 100
                    leapYear = true;
                }
            }
        }
        //step 5 return is not in range or is not a leap year
        return leapYear;
    }
}

