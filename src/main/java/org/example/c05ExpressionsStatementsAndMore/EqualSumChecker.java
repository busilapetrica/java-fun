package org.example.c05ExpressionsStatementsAndMore;

/***********************************
 Equal Sum Checker

 Write a method hasEqualSum with 3 parameters of type int.
 The method should return boolean and it needs to return true if the sum of the
 first and second parameter is equal to the third parameter. Otherwise, return false.
 **********************************/
public class EqualSumChecker {
    private EqualSumChecker() {
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int sum) {
        boolean sumEqual = false;

        if (numberOne + numberTwo == sum) {
            sumEqual = true;
        }
        return sumEqual;
    }
}
