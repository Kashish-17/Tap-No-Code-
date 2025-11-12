package com.Tap_NoCode.stepdefinitions;

import com.Tap_NoCode.utils.ElementUtils;
import org.junit.Assert;
import com.Tap_NoCode.driverfactory.DriverFactory;
import com.Tap_NoCode.pages.1762517948444PqJjsTkFtc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class 1762517948444PqJjsTkFtc extends DriverFactory {
1762517948444PqJjsTkFtc loginPage = new 1762517948444PqJjsTkFtc(driver);
@Given("the user is on the login page")
public void the_user_is_on_the_login_page() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginPage();
}
@Given("the user enters a valid email address {string}")
public void the_user_enters_a_valid_email_address(String email) {
loginPage.enterEmail(email);
}
@Given("the user enters a valid password {string}")
public void the_user_enters_a_valid_password(String password) {
loginPage.enterPassword(password);
}
// @Then("the login button should be enabled")
// public void the_login_button_should_be_enabled() {
// loginPage.isLoginButtonEnabled();
// }
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be logged in successfully")
public void the_user_should_be_logged_in_successfully() {
loginPage.isUserLoggedIn();
}
// @Then("the home screen should load without errors")
// public void the_home_screen_should_load_without_errors() {
// loginPage.isHomeScreenLoaded();
// }
// @Then("the Google Map should be displayed on the home screen")
// public void the_google_map_should_be_displayed_on_the_home_screen() {
// loginPage.isGoogleMapDisplayed();
// }
@Then("the menu bar and recenter icon should be visible on the home screen")
public void the_menu_bar_and_recenter_icon_should_be_visible_on_the_home_screen() {
loginPage.isMenuBarVisible();
loginPage.isRecentIconVisible();
}
// @Given("I check the {string} checkbox")
// public void i_check_the_checkbox(String checkbox) {
// loginPage.checkCheckbox(checkbox);
// }
// @Given("the application is installed on a mobile device")
// public void the_application_is_installed_on_a_mobile_device() {
// Logic to check if the application is installed on a mobile device
// }
// @When("I navigate to the login page")
// public void i_navigate_to_the_login_page() {
// loginPage.navigateToLoginPage();
// }
@When("I click the password visibility toggle")
public void i_click_the_password_visibility_toggle() {
loginPage.togglePasswordVisibility();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
loginPage.isPasswordVisible();
}
@Given("the user is logged in")
public void the_user_is_logged_in() {
// Logic to ensure the user is logged in
}
// @When("I log out of the application")
// public void i_log_out_of_the_application() {
// loginPage.logout();
// }
// @Then("I should see an unexpected error message")
// public void i_should_see_an_unexpected_error_message() {
// loginPage.isUnexpectedErrorMessageDisplayed();
// }
@Then("an appropriate error message should be displayed")
public void an_appropriate_error_message_should_be_displayed() {
loginPage.isErrorMessageDisplayed();
}
@Given("the application is open")
public void the_application_is_open() {
// Logic to ensure the application is open
}
@Given("the email input field is empty")
public void the_email_input_field_is_empty() {
loginPage.clearEmailField();
}
@Given("the password input field is empty")
public void the_password_input_field_is_empty() {
loginPage.clearPasswordField();
}
@Given("both email and password fields are empty")
public void both_email_and_password_fields_are_empty() {
loginPage.clearEmailField();
loginPage.clearPasswordField();
}
@Given("the user enters a valid email address {string} for an unverified account")
public void the_user_enters_a_valid_email_address_for_an_unverified_account(String email) {
loginPage.enterEmail(email);
}
@Given("the user enters valid credentials for a verified account")
public void the_user_enters_valid_credentials_for_a_verified_account() {
loginPage.enterEmail("krishna@gmail.com");
loginPage.enterPassword("validPassword123");
}
// @When("a server error occurs")
// public void a_server_error_occurs() {
// Logic to simulate a server error
// }
// @When("a network error occurs")
// public void a_network_error_occurs() {
// Logic to simulate a network error
// }
// @When("I wait for the session to timeout")
// public void i_wait_for_the_session_to_timeout() {
// Logic to simulate waiting for session timeout
// }
// @Then("I should see a session timeout message")
// public void i_should_see_a_session_timeout_message() {
// loginPage.isSessionTimeoutMessageDisplayed();
// }
// @Then("the error message should be clearElement and informative")
// public void the_error_message_should_be_clear_and_informative() {
// loginPage.isErrorMessageClearAndInformative();
// }
@Then("the user should be redirected back to the login page")
public void the_user_should_be_redirected_back_to_the_login_page() {
loginPage.isOnLoginPage();
}
@When("I correct the password to the correct password")
public void i_correct_the_password_to_the_correct_password() {
loginPage.enterPassword("validPassword123");
}
@Given("the user enters an invalid email format {string}")
public void the_user_enters_an_invalid_email_format(String email) {
loginPage.enterEmail(email);
}
@Given("the user enters an XSS attempt {string} in the password field")
public void the_user_enters_an_xss_attempt_in_the_password_field(String xssAttempt) {
loginPage.enterPassword(xssAttempt);
}
@Given("the user enters {string} in the email input field")
public void the_user_enters_in_the_email_input_field(String email) {
loginPage.enterEmail(email);
}
@Given("the user enters {string} in the password input field")
public void the_user_enters_in_the_password_input_field(String password) {
loginPage.enterPassword(password);
}
@Then("the user should see the login page displayed")
public void the_user_should_see_the_login_page_displayed() {
loginPage.isOnLoginPage();
}
@Then("the user should see an error message")
public void the_user_should_see_an_error_message() {
loginPage.isErrorMessageDisplayed();
}
@Then("the user should see a success message")
public void the_user_should_see_a_success_message() {
loginPage.isSuccessMessageDisplayed();
}
@Then("the user should see the correct user role displayed on the home screen")
public void the_user_should_see_the_correct_user_role_displayed_on_the_home_screen() {
loginPage.isUserRoleDisplayed();
}
@Then("the user should see the home screen load without errors")
public void the_user_should_see_the_home_screen_load_without_errors() {
loginPage.isHomeScreenLoaded();
}
@Then("the user should see the home screen remain displayed")
public void the_user_should_see_the_home_screen_remain_displayed() {
loginPage.isHomeScreenDisplayed();
}
@Then("the user should still be logged in on the first tab")
public void the_user_should_still_be_logged_in_on_the_first_tab() {
loginPage.isUserLoggedIn();
}
@Then("the user should be logged out successfully")
public void the_user_should_be_logged_out_successfully() {
loginPage.isUserLoggedOut();
}
@Then("the user should see an error message for SQL injection")
public void the_user_should_see_an_error_message_for_sql_injection() {
loginPage.isErrorMessageDisplayed();
}
@Then("the user should see an error message for locked account")
public void the_user_should_see_an_error_message_for_locked_account() {
loginPage.isErrorMessageDisplayed();
}
@Then("the user should see an error message for expired account")
public void the_user_should_see_an_error_message_for_expired_account() {
loginPage.isErrorMessageDisplayed();
}