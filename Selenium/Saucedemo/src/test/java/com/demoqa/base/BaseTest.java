package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utilities.Utility.setUtilityDriver;

public class BaseTest   {

    private WebDriver driver;
    private String DemoQA_URL="https://demoqa.com/";
    protected BasePage basePage;
    protected HomePage homePage;

    @BeforeEach
    public void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(DemoQA_URL);

        basePage = new BasePage();
        basePage.setDriver(driver);

        setUtilityDriver();

        homePage = new HomePage();
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
