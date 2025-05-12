package com.saucedemo.base;

import com.base.BasePage;
import com.saucedemo.pages.LoginPage;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    String url = "https://www.saucedemo.com/";

    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void iniApp(){
        driver.get(url);

        basePage = new BasePage();
        basePage.setDriver(driver);

        loginPage = new LoginPage();

    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }
}
