package org.example.c05ExpressionsStatementsAndMore;

import javax.imageio.ImageReader;

/************************
 We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
 In all other cases return false.
 If the hourOfDay parameter is less than 0 or greater than 23 return false
 ************************/
public class BarkingDog {
    private BarkingDog() {
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean dogBarks = false;
        //We have to wake up if the dog is barking
        // before 8 or after 22 hours.
        if(barking) {
            if (hourOfDay > 0 && hourOfDay < 23) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    dogBarks = true;
                }
            }
        }
        return dogBarks;
    }
}
