package com.thoughtworks.refactoring.replaceTempwithQuery;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by xinzhang on 6/27/17.
 */
public class ProductTest {

    @Test
    public void shouldReturnProductWithGivenParams() {
        String givenName = "Cookie";
        int givenPurchasePrice = 30;

        Product product = new Product(givenName);
        product.setPurchasePrice(givenPurchasePrice);

        assertThat(product.getName(), is(givenName));
        assertThat(product.getPurchasePrice(), is(givenPurchasePrice));
    }

    @Test
    public void shouldReturnPriceTrebleWhenGivenPurchasePriceLessThan100() {
        int givenPurchasePrice = 30;
        Product product = new Product("Cookie");
        product.setPurchasePrice(givenPurchasePrice);

        double price = product.calcSellingPrice();

        assertThat(price, is((double)givenPurchasePrice * 3));
    }

    @Test
    public void shouldReturnPriceTrebleWhenGivenPurchasePriceEqualTo100() {
        int givenPurchasePrice = 100;
        Product product = new Product("Cookie");
        product.setPurchasePrice(givenPurchasePrice);

        double price = product.calcSellingPrice();

        assertThat(price, is((double)givenPurchasePrice * 3));
    }

    @Test
    public void shouldReturnPriceDoubleWhenGivenPurchasePriceGreaterThan100() {
        int givenPurchasePrice = 120;
        Product product = new Product("Cookie");
        product.setPurchasePrice(givenPurchasePrice);

        double price = product.calcSellingPrice();

        assertThat(price, is((double)givenPurchasePrice * 2));
    }

}
