package org.example.c05ExpressionsStatementsAndMore;

/***********************************888
 DecimalComparator

 Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 The method should return boolean and it needs to return true if
 two double numbers are the same up to three decimal places. Otherwise, return false.
 ************************************/
public class DecimalComparator {
    private DecimalComparator() {
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        boolean numbersAreEquals = false;
        int numberOne = (int) (x * 1000);
        int numberTwo = (int) (y * 1000);

        if (numberOne == numberTwo) {
            numbersAreEquals = true;
        }
        return numbersAreEquals;
    }
}
