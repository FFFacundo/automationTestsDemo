package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{

    public static void scrollToElementJs(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

    public static void clickJs(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].click();";

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(jsScript,element);
    }

}
