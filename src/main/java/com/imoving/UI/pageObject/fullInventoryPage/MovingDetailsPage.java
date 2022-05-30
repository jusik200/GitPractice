package com.imoving.UI.pageObject.fullInventoryPage;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovingDetailsPage {
    public MovingDetailsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
// Pick up from elements
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/input-auto-complete-address/span/input")
    public WebElement pickUpFromZipCodeInputField;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/button")
    public WebElement pickUpFromRestrictionsButton;
    public void clickPickUpFromRestrictionsButton(){
        Helper.click(pickUpFromRestrictionsButton);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[1]/div/div/button[2]")
    public WebElement pickUpFromFlightOfStairsQuantityPlusButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[1]/div/div/strong")
    public WebElement pickUpFromFlightOfStairsQuantityCounter;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[2]/div/div/button[2]")
    public WebElement pickUpFromLongCarryQuantityPlusButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[2]/div/div/strong")
    public WebElement pickUpFromLongCarryQuantityCounter;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[3]/div/div/label")
    public WebElement pickUpFromElevatorSwitcher;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/address-instructions/div/div[2]/ul/li[9]/div/button")
    public WebElement pickUpFromApproveInstructionsToTheMovers;
    public void clickPickUpFromApproveInstructionsToTheMovers(){
        Helper.click(pickUpFromApproveInstructionsToTheMovers);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[1]/address-selection/div/h3/span/span[1]")
    public WebElement pleaseEnterFullAddressPickUpFromWarning;



    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/input-auto-complete-address/span/input")
    public WebElement dropOffAtZipCodeInputField;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/button")
    public WebElement dropOffAtRestrictionsButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/address-instructions/div/div[2]/ul/li[9]/div/button")
    public WebElement dropOffAtApproveInstructionsToTheMovers;
    public void clickDropOffAtApproveInstructionsToTheMovers(){
        Helper.click(dropOffAtApproveInstructionsToTheMovers);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[1]/div[2]/address-selection/div/h3/span/span[1]")
    public WebElement pleaseEnterFullAddressDropOffAtFromWarning;


    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[1]/date-picker/div/p/span/button")
    public WebElement datePickerButton;
    public void clickDatePickerButton(){
        Helper.click(datePickerButton);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[1]/date-picker/div/p/div/ul/li/div/table/tbody/tr[6]/td[5]/button")
    public WebElement may5thButton;
    public void clickMay5thButton(){
        Helper.click(may5thButton);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[1]/div/label[2]")
    public WebElement afterNoonPickUpDateRadioButton;
    public void clickAfterNoonPickUpDateRadioButton(){
        Helper.click(afterNoonPickUpDateRadioButton);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div/section[2]/div[1]/div[2]/div[2]/div[2]/div/select")
    public WebElement flexibleWithDateDropDownMenu;
}
