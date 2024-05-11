package org.example.c05ExpressionsStatementsAndMore;

public class TeenNumberChecker {
    private TeenNumberChecker() {
    }

    public static boolean hasTeen(int x, int y, int z) {
        return isTeen(x) || isTeen(y) || isTeen(z);
    }

    public static boolean isTeen(int number) {
        return number > 12 && number < 20;
    }
}
