package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginErrorMessageTest(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("wrongPassword");
        loginPage.clickLoginButton();
        String actualMessage= loginPage.getErrorMessage();
        String partOfExpectedMessage = "Epic sadface";

        Assertions.assertTrue(actualMessage.contains(partOfExpectedMessage));
    }
}
