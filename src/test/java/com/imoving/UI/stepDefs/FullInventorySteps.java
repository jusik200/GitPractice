package com.imoving.UI.stepDefs;

import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObject.fullInventoryPage.FullInventoryPage;
import com.imoving.UI.pageObject.HomePage;
import com.imoving.UI.pageObject.fullInventoryPage.popUps.BoxCalculatorPage;
import com.imoving.UI.pageObject.fullInventoryPage.popUps.TheseAreRecommendedRoomsForAPopUpPage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class FullInventorySteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    BoxCalculatorPage boxCalculatorPage = new BoxCalculatorPage();
    FullInventoryPage fullInventoryPage = new FullInventoryPage();
    TheseAreRecommendedRoomsForAPopUpPage theseAreRecommendedRoomsForAPopUpPage = new TheseAreRecommendedRoomsForAPopUpPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("user should select {string} in Move Size drop down menu")
    public void user_should_select_in_move_size_drop_down_menu(String string) {
        Helper.selectByVisibleText(homePage.bedroomAmountSelect, string);

    }

    @Then("{string} pop up should appear")
    public void pop_up_should_appear(String string) {
        Helper.waitElementToBeDisplayed(theseAreRecommendedRoomsForAPopUpPage.theseAreRecommendedRoomsPopUpText);
        Assertions.assertEquals(string.trim(), theseAreRecommendedRoomsForAPopUpPage.theseAreRecommendedRoomsPopUpText.getText().trim());

    }

    @When("user click on Continue button in These are recommended rooms for a pop up")
    public void user_click_on_continue_button_in_these_are_recommended_rooms_for_a_pop_up() {
        Helper.click(theseAreRecommendedRoomsForAPopUpPage.theseAreRecommendedRoomsPopUpContinueButton);

    }

    @Then("Boxes pop up should appear with {string} button")
    public void boxes_pop_up_should_appear_with_button(String string) {
        Helper.waitElementToBeDisplayed(fullInventoryPage.boxesPopUpGotItButton);
        Assertions.assertEquals(string.trim(), fullInventoryPage.boxesPopUpGotItButton.getText().trim());
    }

    @When("user click on GOT IT button in Boxes pop up")
    public void user_click_on_got_it_button_in_boxes_pop_up() {
        Helper.waitElementToBeClickable(fullInventoryPage.boxesPopUpGotItButton);
        js.executeScript("arguments[0].click()", fullInventoryPage.boxesPopUpGotItButton);
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
        js.executeScript("arguments[0].click()", fullInventoryPage.livingRoomSofaAddToInventoryButton);
    }

    @When("user should click add to inventory TV in Living room")
    public void user_should_click_add_to_inventory_tv_in_living_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.livingRoomTVAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Living room")
    public void user_should_click_save_and_go_to_next_button_in_living_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @When("user should click add to inventory Dresser in Bedroom room")
    public void user_should_click_add_to_inventory_dresser_in_bedroom_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.bedroomDresserAddToInventoryButton);
    }

    @When("user should click add to inventory Bed in Bedroom room")
    public void user_should_click_add_to_inventory_bed_in_bedroom_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.bedroomBedAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Bedroom room")
    public void user_should_click_save_and_go_to_next_button_in_bedroom_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);

    }

    @When("user should click add to inventory Kitchen_Dining chairs in Dining room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_dining_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.diningRoomKitchenDiningChairsAddToInventoryButton);
    }

    @When("user should click add to inventory Kitchen_Dining table in Dining room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_dining_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.diningRoomKitchenDiningTableAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Dining room")
    public void user_should_click_save_and_go_to_next_button_in_dining_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @When("user should click add to inventory Kitchen_Dining chairs in Kitchen room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_kitchen_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.kitchenKitchenDiningChairsAddToInventoryButton);
    }

    @When("user should click add to inventory Kitchen_Dining table in Kitchen room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_kitchen_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.kitchenKitchenDiningTableAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Kitchen room")
    public void user_should_click_save_and_go_to_next_button_in_kitchen_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);

    }

    @When("user should click add to inventory Basket_Hamper in Bathroom room")
    public void user_should_click_add_to_inventory_basket_hamper_in_bathroom_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.bathroomBasketHamperAddToInventoryButton);
    }

    @When("user should click add to inventory Trash Can in Bathroom room")
    public void user_should_click_add_to_inventory_trash_can_in_bathroom_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.bathroomTrashCanAddToInventoryButton);
    }

    @Then("user should click save and go to next button in Bathroom room")
    public void user_should_click_save_and_go_to_next_button_in_bathroom_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }

    @When("user should click add to inventory Outdoor chair in Patio room")
    public void user_should_click_add_to_inventory_outdoor_chair_in_patio_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.patioOutdoorChairAddToInventoryButton);
    }

    @When("user should click add to inventory Outdoor table in Patio room")
    public void user_should_click_add_to_inventory_outdoor_table_in_patio_room() {
        js.executeScript("arguments[0].click()", fullInventoryPage.patioOutdoorsTableAddToInventoryButton);
        Helper.pause(3000);
    }

    @When("user should click save and go to next button in Patio room")
    public void user_should_click_save_and_go_to_next_button_in_patio_room() {
        Helper.click(fullInventoryPage.saveAndGoToNextButton);
    }


    @Then("{string} pop up appears")
    public void popUpAppears(String arg0) {
        Assertions.assertEquals(arg0.trim(), boxCalculatorPage.boxCalculatorPopUpHeader.getText().trim());
    }


    @When("user should click Add and Continue button in Box Calculator pop up")
    public void user_should_click_add_and_continue_button_in_box_calculator_pop_up() {
        Helper.click(boxCalculatorPage.addAndContinueButton);
        Helper.pause(2000);
    }

}
