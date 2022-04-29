package com.imoving.UI.stepDefs;

import com.imoving.UI.methods.CustomAssertions;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObject.fullInventoryPage.FullInventoryPage;
import com.imoving.UI.pageObject.HomePage;
import com.imoving.UI.pageObject.fullInventoryPage.MovingDetailsPage;
import com.imoving.UI.pageObject.fullInventoryPage.popUps.BoxCalculatorPage;
import com.imoving.UI.pageObject.fullInventoryPage.popUps.TheseAreRecommendedRoomsForAPopUpPage;
import com.imoving.UI.pageObject.fullInventoryPage.rooms.LivingRoomPage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class FullInventorySteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    BoxCalculatorPage boxCalculatorPage = new BoxCalculatorPage();
    FullInventoryPage fullInventoryPage = new FullInventoryPage();
    LivingRoomPage livingRoomPage = new LivingRoomPage();
    MovingDetailsPage movingDetailsPage = new MovingDetailsPage();
    TheseAreRecommendedRoomsForAPopUpPage theseAreRecommendedRoomsForAPopUpPage = new TheseAreRecommendedRoomsForAPopUpPage();


    @Given("user should select {string} in Move Size drop down menu")
    public void user_should_select_in_move_size_drop_down_menu(String string) {
        Helper.selectByVisibleText(homePage.bedroomAmountSelect, string);
    }

    @Then("{string} pop up should appear")
    public void pop_up_should_appear(String string) {
        Helper.waitElementToBeDisplayed(theseAreRecommendedRoomsForAPopUpPage.theseAreRecommendedRoomsPopUpText);
        CustomAssertions.assertText("here we comparing pop up txt", string, theseAreRecommendedRoomsForAPopUpPage.theseAreRecommendedRoomsPopUpText);

    }

    @When("user click on Continue button in These are recommended rooms for a pop up")
    public void user_click_on_continue_button_in_these_are_recommended_rooms_for_a_pop_up() {
        Helper.click(theseAreRecommendedRoomsForAPopUpPage.theseAreRecommendedRoomsPopUpContinueButton);
    }

    @Then("Boxes pop up should appear with {string} button")
    public void boxes_pop_up_should_appear_with_button(String string) {
        Helper.waitElementToBeDisplayed(fullInventoryPage.boxesPopUpGotItButton);
        CustomAssertions.assertText("boxes pop up", string, fullInventoryPage.boxesPopUpGotItButton);
    }

    @When("user click on GOT IT button in Boxes pop up")
    public void user_click_on_got_it_button_in_boxes_pop_up() {
        Helper.waitElementToBeClickable(fullInventoryPage.boxesPopUpGotItButton);
        Helper.click(fullInventoryPage.boxesPopUpGotItButton);
    }

    @When("hint {string} appears")
    public void hint_appears(String string) {
        Helper.waitElementToBeDisplayed(fullInventoryPage.hereYouCanSeeAllYourRoomsAndStartMovingHint);
        Assertions.assertEquals(string.trim(), fullInventoryPage.hereYouCanSeeAllYourRoomsAndStartMovingHint.getText().trim());
    }

    @When("user clicks Next button in Here you can see all your rooms and start moving! hint")
    public void user_clicks_next_button_in_here_you_can_see_all_your_rooms_and_start_moving_hint() {
        Helper.click(fullInventoryPage.hereYouCanSeeAllYourRoomsAndStartMovingHintNextButton);
    }

    @Then("should see hint {string}")
    public void shouldSeeHint(String arg0) {
        Helper.waitElementToBeDisplayed(fullInventoryPage.hereYouCanSeeInventoryItemsForSelectedRoomHint);
        Assertions.assertEquals(arg0.trim(), fullInventoryPage.hereYouCanSeeInventoryItemsForSelectedRoomHint.getText().trim());
    }

    @When("user should click Next button in Here you can see inventory items for selected room! hint")
    public void user_should_click_next_button_in_here_you_can_see_inventory_items_for_selected_room_hint() {
        Helper.click(fullInventoryPage.hereYouCanSeeInventoryItemsForSelectedRoomHintNextButton);
    }

    @And("user see hint {string}")
    public void userSeeHint(String arg0) {
        Helper.waitElementToBeDisplayed(fullInventoryPage.pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomHint);
        Assertions.assertEquals(arg0.trim(), fullInventoryPage.pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomHint.getText().trim());
    }

    @Then("user should click Ok button in Press this button to save choosed items and move to the next room! hint")
    public void user_should_click_ok_button_in_press_this_button_to_save_choosed_items_and_move_to_the_next_room_hint() {
        Helper.click(fullInventoryPage.pressThisButtonToSaveChoosedItemsAndMoveToTheNextRoomHintOkButton);
    }

    @When("user should click add to inventory Sofa in Living room")
    public void user_should_click_add_to_inventory_sofa_in_living_room() {
        Helper.navigateToElement(livingRoomPage.sofaImage);
        Helper.click(livingRoomPage.livingRoomSofaAddToInventoryButton);
    }

    @When("user should click add to inventory TV in Living room")
    public void user_should_click_add_to_inventory_tv_in_living_room() {
        Helper.navigateToElement(livingRoomPage.tvImage);
        Helper.click(livingRoomPage.livingRoomTVAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Living room")
    public void user_should_click_save_and_go_to_next_button_in_living_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @When("user should click add to inventory Dresser in Bedroom room")
    public void user_should_click_add_to_inventory_dresser_in_bedroom_room() {
        Helper.clickJSExecutor(fullInventoryPage.bedroomDresserAddToInventoryButton);
    }

    @When("user should click add to inventory Bed in Bedroom room")
    public void user_should_click_add_to_inventory_bed_in_bedroom_room() {
        Helper.clickJSExecutor(fullInventoryPage.bedroomBedAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Bedroom room")
    public void user_should_click_save_and_go_to_next_button_in_bedroom_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);

    }

    @When("user should click add to inventory Kitchen_Dining chairs in Dining room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_dining_room() {
        Helper.clickJSExecutor(fullInventoryPage.diningRoomKitchenDiningChairsAddToInventoryButton);
    }

    @When("user should click add to inventory Kitchen_Dining table in Dining room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_dining_room() {
        Helper.clickJSExecutor(fullInventoryPage.diningRoomKitchenDiningTableAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Dining room")
    public void user_should_click_save_and_go_to_next_button_in_dining_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @When("user should click add to inventory Kitchen_Dining chairs in Kitchen room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_kitchen_room() {
        Helper.clickJSExecutor(fullInventoryPage.kitchenKitchenDiningChairsAddToInventoryButton);
    }

    @When("user should click add to inventory Kitchen_Dining table in Kitchen room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_kitchen_room() {
        Helper.clickJSExecutor(fullInventoryPage.kitchenKitchenDiningTableAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Kitchen room")
    public void user_should_click_save_and_go_to_next_button_in_kitchen_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);

    }

    @When("user should click add to inventory Basket_Hamper in Bathroom room")
    public void user_should_click_add_to_inventory_basket_hamper_in_bathroom_room() {
        Helper.clickJSExecutor(fullInventoryPage.bathroomBasketHamperAddToInventoryButton);
    }

    @When("user should click add to inventory Trash Can in Bathroom room")
    public void user_should_click_add_to_inventory_trash_can_in_bathroom_room() {
        Helper.clickJSExecutor(fullInventoryPage.bathroomTrashCanAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Bathroom room")
    public void user_should_click_save_and_go_to_next_button_in_bathroom_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @When("user should click add to inventory Outdoor chair in Patio room")
    public void user_should_click_add_to_inventory_outdoor_chair_in_patio_room() {
        Helper.clickJSExecutor(fullInventoryPage.patioOutdoorChairAddToInventoryButton);
    }

    @When("user should click add to inventory Outdoor table in Patio room")
    public void user_should_click_add_to_inventory_outdoor_table_in_patio_room() {
        Helper.clickJSExecutor(fullInventoryPage.patioOutdoorsTableAddToInventoryButton);
    }

    @When("user should click save and go to next button in Patio room")
    public void user_should_click_save_and_go_to_next_button_in_patio_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @Then("{string} pop up appears")
    public void popUpAppears(String arg0) {
        Helper.waitElementToBeDisplayed(boxCalculatorPage.boxCalculatorPopUpHeader);
        Assertions.assertEquals(arg0.trim(), boxCalculatorPage.boxCalculatorPopUpHeader.getText().trim());
    }


    @When("user should click Add and Continue button in Box Calculator pop up")
    public void user_should_click_add_and_continue_button_in_box_calculator_pop_up() {
        boxCalculatorPage.clickAddContinueButton();

    }

    @Given("user should input {int} zip code to pick up from input field and choose very first option")
    public void userShouldInputZipCodeToPickUpFromInputFieldAndChooseVeryFirstOption(int arg0) {
        Helper.sendKeys(movingDetailsPage.pickUpFromZipCodeInputField, String.valueOf(arg0));
        Helper.click(movingDetailsPage.pickUpFromZipCodeInputField);
        Helper.pause(199);
        Helper.sendKeys(movingDetailsPage.pickUpFromZipCodeInputField, Keys.ARROW_DOWN);
        Helper.sendKeys(movingDetailsPage.pickUpFromZipCodeInputField, Keys.RETURN);
    }

    @And("user should increment flight of stairs to {int}")
    public void userShouldIncrementFlightOfStairsTo(int arg0) {
        Helper.multiClick(movingDetailsPage.pickUpFromFlightOfStairsQuantityPlusButton, arg0);
    }

    @Then("flight of stairs quantity counter should display {int}")
    public void flightOfStairsQuantityCounterShouldDisplay(int arg0) {
        CustomAssertions.assertText("asserting flight of stairs quantity", String.valueOf(arg0), movingDetailsPage.pickUpFromFlightOfStairsQuantityCounter);
    }

    @When("user should increment long carry to {int}{int}")
    public void userShouldIncrementLongCarryTo(int arg0, int arg1) {
        Helper.click(movingDetailsPage.pickUpFromLongCarryQuantityPlusButton);
    }

    @Then("long carry quantity counter should display {string}")
    public void longCarryQuantityCounterShouldDisplay(String arg0) {
        CustomAssertions.assertText("asserting long carry", arg0, movingDetailsPage.pickUpFromLongCarryQuantityCounter);
    }

    @When("user click approve button in pick up from restrictions")
    public void userClickApproveButtonInPickUpFromRestrictions() {
        movingDetailsPage.clickPickUpFromApproveInstructionsToTheMovers();
    }

    @And("user should input {int} zip code to drop off at input field and choose second option")
    public void userShouldInputZipCodeToDropOffAtInputFieldAndChooseSecondOption(int arg0) {
        Helper.sendKeys(movingDetailsPage.dropOffAtZipCodeInputField, String.valueOf(arg0));
        Helper.click(movingDetailsPage.dropOffAtZipCodeInputField);
        Helper.sendKeys(movingDetailsPage.dropOffAtZipCodeInputField, Keys.ARROW_DOWN);
        Helper.sendKeys(movingDetailsPage.dropOffAtZipCodeInputField, Keys.ARROW_DOWN);
        Helper.sendKeys(movingDetailsPage.dropOffAtZipCodeInputField, Keys.RETURN);
    }

    @Then("user click approve button in drop off at restrictions")
    public void userClickApproveButtonInDropOffAtRestrictions() {
        movingDetailsPage.clickDropOffAtApproveInstructionsToTheMovers();
    }

    @When("user should choose pick up date {int} may {int}")
    public void userShouldChoosePickUpDateMay(int arg0, int arg1) {
        movingDetailsPage.clickDatePickerButton();
        movingDetailsPage.clickMay5thButton();
    }

    @And("choose the {int}pm - {int}pm radiobutton")
    public void chooseThePmPmRadiobutton(int arg0, int arg1) {
        movingDetailsPage.clickAfterNoonPickUpDateRadioButton();
        Helper.pause(5000);
    }

    @And("choose {string} flexible date")
    public void chooseFlexibleDate(String arg0) {
        Helper.selectByVisibleText(movingDetailsPage.flexibleWithDateDropDownMenu, arg0);
        Helper.pause(5000);
    }
}
