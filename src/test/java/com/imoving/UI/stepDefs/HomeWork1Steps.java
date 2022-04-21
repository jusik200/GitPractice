package com.imoving.UI.stepDefs;

import com.imoving.UI.dataProviders.ConfigReader;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObject.HomePage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomeWork1Steps {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    @Given("user is on live environment")
    public void user_is_on_live_environment() {
        driver.get(ConfigReader.getProperty("environment"));
        
    }
    @When("user should select My Apartment on What are you moving selector")
    public void user_should_select_my_house_on_what_are_you_moving_selector() {
        Helper.selectByVisibleText(homePage.houseTypeSelect, "My Apartment");
    }

    @When("user should select {int} bedroom, on bedroom amount selector")
    public void user_should_select_bedroom_on_bedroom_amount_selector(Integer int1) {
        Helper.selectByIndex(homePage.bedroomAmountSelect, 3);
        
    }
    @When("user should click on compare quotes button")
    public void user_should_click_on_compare_quotes_button() {
        Helper.click(homePage.compareQuotesButton);
        Helper.pause(2000);
        
    }
    @Then("user should see configurator")
    public void user_should_see_configurator() {
        
        
    }

}
