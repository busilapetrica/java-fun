package org.example.c05ExpressionsStatementsAndMore;

public class MegaBytesConverter {
    private MegaBytesConverter() {
    }
    public static int[] megaBytesAndKiloBytesCalculator(int kiloBytes) {
        //print a message in the format "XX KB = YY MB and ZZ KB".
        int[] size = new int[2];
        int megaBytes = 1024;
        size[0] = kiloBytes / megaBytes;
        size[1] = kiloBytes % megaBytes;

        return size;
    }
}
