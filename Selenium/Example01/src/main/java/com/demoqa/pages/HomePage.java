package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJs;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToFormsPage(){
        scrollToElementJs(formsCard);
        click(formsCard);
        return new FormsPage();
    }

}
