package com.imoving.UI.pageObject;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/main[1]/section[1]/figure[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")
    public WebElement compareQuotesButton;

    @FindBy(xpath = "/html/body/div[2]/div/main/section[1]/figure/div/div/div[1]/ul/li[1]/a")
    public WebElement movingTab;

    @FindBy(xpath = "/html/body/div[2]/div/main/section[1]/figure/div/div/div[1]/ul/li[2]/a")
    public WebElement laborTab;

    @FindBy(id = "houseTypeSelectList")
    public WebElement houseTypeSelect;

    @FindBy(id = "hp-nav-select-house")
    public WebElement bedroomAmountSelect;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/main[1]/section[1]/figure[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]")
    public WebElement houseTypeSelectedValue;


}
