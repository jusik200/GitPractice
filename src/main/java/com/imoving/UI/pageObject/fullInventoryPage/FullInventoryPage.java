package com.imoving.UI.pageObject.fullInventoryPage;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullInventoryPage {

    public FullInventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    public WebElement boxesPopUpGotItButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[1]/div/p[1]")
    public WebElement hereYouCanSeeAllYourRoomsAndStartMovingHint;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[1]/div/a[2]")
    public WebElement hereYouCanSeeAllYourRoomsAndStartMovingHintNextButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[2]/div/p[1]")
    public WebElement hereYouCanSeeInventoryItemsForSelectedRoomHint;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[2]/div/a[2]")
    public WebElement hereYouCanSeeInventoryItemsForSelectedRoomHintNextButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[3]/div/p[1]")
    public WebElement pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomHint;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/section[3]/div/a")
    public WebElement pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomHintOkButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement livingRoomTab;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div[1]/div[2]")
    public WebElement bedroomTab;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div[1]/div[3]")
    public WebElement diningRoomTab;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div[1]/div[4]")
    public WebElement kitchenTab;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div[1]/div[5]")
    public WebElement bathroomTab;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div[1]/div[6]")
    public WebElement patioTab;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[3]/div[1]/button")
    public WebElement saveAndGoToNextButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement livingRoomSofaAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement livingRoomTVAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement bedroomDresserAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement bedroomBedAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement diningRoomKitchenDiningChairsAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement diningRoomKitchenDiningTableAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement kitchenKitchenDiningChairsAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement kitchenKitchenDiningTableAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement bathroomBasketHamperAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement bathroomTrashCanAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[1]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement patioOutdoorChairAddToInventoryButton;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/main/div/div[1]/section/div[2]/div/div[2]/div/div/figure/div[2]/div[4]/div/a[1]")
    public WebElement patioOutdoorsTableAddToInventoryButton;



//    @FindBy(xpath = "")
//    public WebElement ;
}
