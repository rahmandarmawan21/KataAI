package config;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static WebDriver driver;

    public void waitUntilElementIsVisible(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void scrollUntilElementIsVisible(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);

    }
}
