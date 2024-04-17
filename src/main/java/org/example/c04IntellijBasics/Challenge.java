package org.example.c04IntellijBasics;

public class Challenge {
    public static void main(String[] args) {
        double firstNumber = 20.00;
        double secondNumber = 80.00;
        double totalValue  = (firstNumber + secondNumber) * 100.00;
        boolean checkNumber;
        if(totalValue % 40.00 == 0){
            checkNumber = true;
        }else{
            checkNumber = false;
        }
        System.out.println(checkNumber);
    }
}
