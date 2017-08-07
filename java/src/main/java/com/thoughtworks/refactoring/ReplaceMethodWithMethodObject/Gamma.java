package com.thoughtworks.refactoring.ReplaceMethodWithMethodObject;

/**
 * Created by yzeng on 07/08/2017.
 */
public class Gamma {
    private UserAccount userAccount;
    private int inputValue;
    private int quantity;
    private int yearToDate;
    private int tempValue1;
    private int tempValue2;
    private int tempValue3;

    public Gamma(UserAccount userAccount, int inputValue, int quantity, int yearToDate) {
        this.userAccount = userAccount;
        this.inputValue = inputValue;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    public int compute() {
        tempValue1 = (inputValue * quantity) + userAccount.Delta;
        tempValue2 = (inputValue * yearToDate) + 100;
        if (yearToDate - tempValue1 > 100)
            tempValue2 -= 20;
        tempValue3 = tempValue2 * 7;
        return tempValue3 - 2 * tempValue1;
    }
}
