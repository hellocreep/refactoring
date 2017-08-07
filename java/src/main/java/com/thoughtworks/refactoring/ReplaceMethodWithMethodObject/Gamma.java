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
        tempValue1 = getTempValue1();
        tempValue2 = getTempValue2();
        tempValue3 = getTempValue3();
        doSomething();
        return finalCompute();
    }

    private int finalCompute() {
        return tempValue3 - 2 * tempValue1;
    }

    private void doSomething() {
        if (yearToDate - tempValue1 > 100)
            tempValue2 -= 20;
    }

    private int getTempValue3() {
        return tempValue2 * 7;
    }

    private int getTempValue2() {
        return (inputValue * yearToDate) + 100;
    }

    private int getTempValue1() {
        return (inputValue * quantity) + userAccount.Delta;
    }
}
