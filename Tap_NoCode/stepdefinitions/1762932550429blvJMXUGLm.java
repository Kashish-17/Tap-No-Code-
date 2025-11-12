package com.Tap_NoCode.stepdefinitions;

import com.Tap_NoCode.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.Tap_NoCode.driverfactory.DriverFactory;
import com.Tap_NoCode.pages.Tap_NoCodePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Tap_NoCode extends DriverFactory {
Tap_NoCodePage tapNoCodePage = new Tap_NoCodePage(driver);
@Given("I am on the login page")
public void i_am_on_the_login_page() {
driver = DriverFactory.getDriver();
tapNoCodePage.navigateToLoginPage();
}
@Given("I enter an email address {string}")
public void i_enter_an_email_address(String email) {
tapNoCodePage.enterEmail(email);
}
@Given("I enter a password {string}")
public void i_enter_a_password(String password) {
tapNoCodePage.enterPassword(password);
}
@When("I click the login button")
public void i_click_the_login_button() {
tapNoCodePage.clickLoginButton();
}
@Then("the home screen should load without errors")
public void the_home_screen_should_load_without_errors() {
tapNoCodePage.isHomeScreenLoaded();
}
@Then("I should be navigated to the home screen")
public void i_should_be_navigated_to_the_home_screen() {
tapNoCodePage.isUserOnHomeScreen();
}
@Then("the Google Map should be displayed")
public void the_google_map_should_be_displayed() {
tapNoCodePage.isGoogleMapDisplayed();
}
@Then("the menu bar should be visible on the home screen")
public void the_menu_bar_should_be_visible_on_the_home_screen() {
tapNoCodePage.isMenuBarVisible();
}