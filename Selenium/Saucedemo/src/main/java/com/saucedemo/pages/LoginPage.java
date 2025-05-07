package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By usernameField=By.id("user-name");
    private By passwordField=By.name("password");
    private By loginButton=By.cssSelector("input.submit-button");
    private By errorMessage=By.xpath(".error-message-container h3");

    public void setUsername(String username){
        send(username, usernameField);
    }
    public void setPassword(String password){
        send(password, passwordField);
    }

    public void clickLoginButton(){
        click(loginButton);
    }

}
