package com.imoving.UI.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsDemo1 {

    public static WebDriver loadSauceLabs() throws MalformedURLException {
        String USERNAME = "oauth-jusik200-1f1b9";
        String ACCESS_KEY = "a856666a-a965-4ece-9c9d-d51b0741c325";
        String url = "https://oauth-jusik200-1f1b9:a856666a-a965-4ece-9c9d-d51b0741c325@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.EDGE);
        capabilities.setCapability("browserVersion", "latest");

        WebDriver driver = new RemoteWebDriver(new URL(url), capabilities);

        return driver;
    }






}
