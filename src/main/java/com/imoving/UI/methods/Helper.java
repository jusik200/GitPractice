package com.imoving.UI.methods;

import com.imoving.UI.utils.Driver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

    public static void click(WebElement element) {
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        element.click();
    }

    public static void waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
