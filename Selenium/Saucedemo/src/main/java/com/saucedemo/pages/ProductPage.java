package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    private By productsHeader= By.cssSelector("span.title");

    public boolean isProductHeaderDisplayed(){
        return find(productsHeader).isDisplayed();
    }

}
