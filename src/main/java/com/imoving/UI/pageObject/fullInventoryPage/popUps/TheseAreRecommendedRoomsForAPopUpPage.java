package com.imoving.UI.pageObject.fullInventoryPage.popUps;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheseAreRecommendedRoomsForAPopUpPage {
    public TheseAreRecommendedRoomsForAPopUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/h2/span[1]")
    public WebElement theseAreRecommendedRoomsPopUpText;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div/a[2]")
    public WebElement theseAreRecommendedRoomsPopUpContinueButton;


}
