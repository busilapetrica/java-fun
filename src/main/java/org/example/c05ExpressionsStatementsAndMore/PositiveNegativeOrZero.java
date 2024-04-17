package org.example.c05ExpressionsStatementsAndMore;

public class PositiveNegativeOrZero {

    public static String checkNumber(int number) {
String checkNumber ;
        if (number > 0) {
            checkNumber = "positive";
        } else if (number < 0) {
            checkNumber = "negative";
        } else {
            checkNumber = "zero";
        }
        return checkNumber;
    }

}

