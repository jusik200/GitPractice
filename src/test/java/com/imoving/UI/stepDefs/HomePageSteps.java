package com.imoving.UI.stepDefs;

import com.imoving.UI.dataProviders.ConfigReader;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.pageObject.HomePage;
import com.imoving.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    @Given("user is on prod environment")
    public void user_is_on_prod_environment() {
        driver.get(ConfigReader.getProperty("environment"));
    }

    @When("user should click labor tab button")
    public void user_should_click_labor_tab_button() {
        Helper.click(homePage.laborTab);
        Helper.pause(2000);
    }

    @Then("user should see {string} and {string} fields")
    public void user_should_see_and_fields(String string, String string2) {
    }


}
