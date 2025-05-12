package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest extends BaseTest {

    @Test
    public void isProductHeaderDisplayedTest(){

        ProductPage productPage = loginPage.logIntoApp("standard_user","secret_sauce");
        Assertions.assertTrue(productPage.isProductHeaderDisplayed(), "The products header is not displayed");

    }

}
