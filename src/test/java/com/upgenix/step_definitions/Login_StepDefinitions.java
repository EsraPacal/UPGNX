package com.upgenix.step_definitions;

import com.github.javafaker.Faker;
import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("User verifies that the title is Login | Best solution for startups")
    public void user_verifies_that_the_title_is_login_best_solution_for_startups() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }

    @When("salesmenager-posmenager user types {string} and {string} in the input boxes")
    public void salesmenager_posmenager_user_types_and_in_the_input_boxes(String email, String password) {
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
    }
    @When("salesmenager-posmanager user clicks login button")
    public void salesmenager_posmanager_user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("Users should see that expectedTitle is {string}")
    public void users_should_see_that_expected_title_is(String string) {
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @When("salesmenager-posmenager user enter {string} and {string} in the input boxes")
    public void salesmenager_posmenager_user_enter_and_in_the_input_boxes(String validEmail, String invalidPassword) {
       loginPage.email.sendKeys(validEmail);
       loginPage.password.sendKeys(invalidPassword);
    }
    @When("salesmenager-posmenager users enter {string} and {string} in the input boxes")
    public void salesmenager_posmenager_users_enter_and_in_the_input_boxes(String invalidEmail, String validPassword) {
        loginPage.email.sendKeys(invalidEmail);
        loginPage.password.sendKeys(validPassword);
    }


    @Then("User should see the error message {string}")
    public void user_should_see_the_error_message(String string) {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }

    @When("salesmenager-posmenager users do not type any credential and click the login button")
    public void salesmenager_posmenager_users_do_not_type_any_credential_and_click_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("User should see the Please fill out this field. message")
    public void user_should_see_the_please_fill_out_this_field_message() {

        Assert.assertEquals("Please fill out this field.", loginPage.email.getAttribute("validationMessage"));
       //Assert.assertTrue(loginPage.password.getAttribute("validationMessage").contains("Please fill out this field."));
    }

    @Given("Salesmanager-Posmanager user clicks the reset password link")
    public void salesmanager_posmanager_user_clicks_the_reset_password_link() {
        loginPage.resetPassword.click();
    }

    @Then("The title should be {string}.")
    public void the_title_should_be(String string) {
        Assert.assertTrue(string.equals(Driver.getDriver().getTitle()));
    }

    @When("Salesmanager-Posmanager user fills in the password field")
    public void salesmanager_posmanager_user_fills_in_the_password_field() {
        Faker faker = new Faker();
        loginPage.password.sendKeys(faker.bothify("???????"));
    }

    @Then("User should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {
        Assert.assertTrue(loginPage.password.getAttribute("type").equals("password"));
    }


}
