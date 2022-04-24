package com.imoving.UI.pageObject.fullInventoryPage.popUps;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoxCalculatorPage {
    public BoxCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/h2")
    public WebElement boxCalculatorPopUpHeader;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/a[4]")
    public WebElement addAndContinueButton;
}
