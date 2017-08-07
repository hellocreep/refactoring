package com.thoughtworks.refactoring.ReplaceMethodWithMethodObject;

/**
 * Created by yzeng on 07/08/2017.
 */
public class UserAccount {
    public static int Delta = 10;
    public int Gamma(int inputValue, int quantity, int yearToDate) {
       return new Gamma(this, inputValue,quantity, yearToDate).compute();
    }
}
