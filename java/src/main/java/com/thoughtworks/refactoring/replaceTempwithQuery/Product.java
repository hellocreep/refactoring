package com.thoughtworks.refactoring.replaceTempwithQuery;

/**
 * Created by xinzhang on 6/27/17.
 */
public class Product {
    private String name;
    private int purchasePrice;

    public Product(String name) {
        this.name = name;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getName() {
        return name;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public double calcSellingPrice() {
        int rate = this.purchasePrice <= 100 ? 3 : 2;
        return this.purchasePrice * rate;
    }
}
