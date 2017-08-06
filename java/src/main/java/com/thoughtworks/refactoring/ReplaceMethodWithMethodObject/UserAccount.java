package com.thoughtworks.refactoring.ReplaceMethodWithMethodObject;

/**
 * Created by yzeng on 07/08/2017.
 */
public class UserAccount {
    public static int Delta = 10;
    public int Gamma(int inputValue, int quantity, int yearToDate) {
        int tempValue1 = (inputValue * quantity) + Delta;
        int tempValue2 = (inputValue * yearToDate) + 100;
        if(yearToDate - tempValue1 > 100 )
            tempValue2 -= 20;
        int tempValue3 = tempValue2 * 7;
        return tempValue3 - 2 * tempValue1;
    }
}
