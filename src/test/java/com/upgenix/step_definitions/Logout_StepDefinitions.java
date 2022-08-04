package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.pages.LogoutPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Logout_StepDefinitions {

    LogoutPage logoutPage= new LogoutPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {

        LoginPage loginPage= new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.email.sendKeys("salesmanager18@info.com");
        loginPage.password.sendKeys("salesmanager");
        loginPage.loginButton.click();
    }
    @Then("User verifies that the title is {string}")
    public void user_verifies_that_the_title_is(String expectedTitle) {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    @When("user clicks the user avatar")
    public void user_clicks_the_user_avatar() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logoutPage.userIcon.click();

    }
    @When("user clicks the logout button in dropdown")
    public void user_clicks_the_logout_button_in_dropdown() {

        logoutPage.LogoutButton.click();
    }

    @Then("Actual title should be {string}")
    public void actual_title_should_be(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("User clicks on the step back button after successfully logging out.")
    public void user_clicks_on_the_step_back_button_after_successfully_logging_out() {
        Driver.getDriver().navigate().back();
    }
    @Then("Odoo Session Expired message is displayed")
    public void odoo_session_expired_message_is_displayed() {
       Assert.assertTrue(logoutPage.sessionExpiredMessage.isDisplayed());
    }


}
