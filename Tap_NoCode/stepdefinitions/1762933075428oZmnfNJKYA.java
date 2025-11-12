package com.Tap_NoCode.stepdefinitions;

import com.Tap_NoCode.utils.ElementUtils;
import org.junit.Assert;
import com.Tap_NoCode.driverfactory.DriverFactory;
import com.Tap_NoCode.pages.1762933075428oZmnfNJKYA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class 1762933075428oZmnfNJKYA extends DriverFactory {
1762933075428oZmnfNJKYA loginPage = new 1762933075428oZmnfNJKYA(driver);
// @Given("I am on the login page")
// public void i_am_on_the_login_page() {
// driver = DriverFactory.getDriver();
// loginPage.navigateToLoginPage();
// }
@When("I enter a valid email address {string}")
public void i_enter_a_valid_email_address(String email) {
loginPage.enterEmail(email);
}
@When("I enter a valid password {string}")
public void i_enter_a_valid_password(String password) {
loginPage.enterPassword(password);
}
@Then("the login button should be enabled")
public void the_login_button_should_be_enabled() {
loginPage.isLoginButtonEnabled();
}
// @When("I click the login button")
// public void i_click_the_login_button() {
// loginPage.clickLoginButton();
// }
@Then("I should be redirected to the home screen")
public void i_should_be_redirected_to_the_home_screen() {
loginPage.isHomeScreenDisplayed();
}
@Then("the Google Map should be displayed on the home screen")
public void the_google_map_should_be_displayed_on_the_home_screen() {
loginPage.isGoogleMapDisplayed();
}
@Then("the menu bar and recenter icon should be visible")
public void the_menu_bar_and_recenter_icon_should_be_visible() {
loginPage.isMenuBarVisible();
loginPage.isRecentIconVisible();
}
@When("I check the {string} checkbox")
public void i_check_the_checkbox(String checkbox) {
loginPage.checkCheckbox(checkbox);
}
@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() {
loginPage.isUserLoggedIn();
}
// @Then("the home screen should load without errors")
// public void the_home_screen_should_load_without_errors() {
// loginPage.isHomeScreenLoaded();
// }
@When("I log out of the application")
public void i_log_out_of_the_application() {
loginPage.logout();
}
@Then("I should be automatically logged back in")
public void i_should_be_automatically_logged_back_in() {
loginPage.isUserLoggedIn();
}
@Given("the application is installed on a mobile device")
public void the_application_is_installed_on_a_mobile_device() {
// Logic to check if the application is installed on a mobile device
}
@When("I navigate to the login page")
public void i_navigate_to_the_login_page() {
loginPage.navigateToLoginPage();
}
@When("I click on the {string} link")
public void i_click_on_the_link(String link) {
loginPage.clickLink(link);
}
@When("I enter {string} to receive a password reset link")
public void i_enter_to_receive_a_password_reset_link(String email) {
loginPage.enterEmailForPasswordReset(email);
}
@Then("the password reset page is displayed")
public void the_password_reset_page_is_displayed() {
loginPage.isPasswordResetPageDisplayed();
}
@Then("the email address is accepted for password reset")
public void the_email_address_is_accepted_for_password_reset() {
loginPage.isEmailAcceptedForPasswordReset();
}
@When("I check my email and follow the password reset link")
public void i_check_my_email_and_follow_the_password_reset_link() {
// Logic to check email and follow the reset link
}
@When("I enter {string} as my new password")
public void i_enter_as_my_new_password(String newPassword) {
loginPage.enterNewPassword(newPassword);
}
@When("I confirm {string}")
public void i_confirm(String newPassword) {
loginPage.confirmNewPassword(newPassword);
}
@Then("the password is reset successfully")
public void the_password_is_reset_successfully() {
loginPage.isPasswordResetSuccessful();
}
@Then("I am redirected back to the login page")
public void i_am_redirected_back_to_the_login_page() {
loginPage.isLoginPageDisplayed();
}
@When("I enter {string} in the email input field")
public void i_enter_in_the_email_input_field(String email) {
loginPage.enterEmail(email);
}
@When("I enter {string} in the password input field")
public void i_enter_in_the_password_input_field(String password) {
loginPage.enterPassword(password);
}
@Then("I should see an error message")
public void i_should_see_an_error_message() {
loginPage.isErrorMessageDisplayed();
}
@Then("the error message should be clearElement and informative")
public void the_error_message_should_be_clear_and_informative() {
loginPage.isErrorMessageClear();
}
@When("I correct the password")
public void i_correct_the_password() {
// Logic to correct the password
}
@When("I enter valid credentials for an active account")
public void i_enter_valid_credentials_for_an_active_account(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials from the data table
}
@Given("the user has a locked account with email {string} and password {string}")
public void the_user_has_a_locked_account_with_email_and_password(String email, String password) {
// Logic to set up a locked account
}
@Given("I have valid credentials for an active account")
public void i_have_valid_credentials_for_an_active_account() {
// Logic to set up valid credentials for an active account
}
@Given("I enter a valid email address {string} for an unverified account")
public void i_enter_a_valid_email_address_for_an_unverified_account(String email) {
loginPage.enterEmail(email);
}
@Then("I should see an error message for unverified account")
public void i_should_see_an_error_message_for_unverified_account() {
loginPage.isErrorMessageDisplayed();
}
@Given("I enter valid credentials for a verified account")
public void i_enter_valid_credentials_for_a_verified_account(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials for a verified account
}
@When("a server error occurs")
public void a_server_error_occurs() {
// Logic to simulate a server error
}
@When("a network error occurs")
public void a_network_error_occurs() {
// Logic to simulate a network error
}
@When("I wait for the session to timeout")
public void i_wait_for_the_session_to_timeout() {
// Logic to wait for session timeout
}
@Then("I should see a session timeout message")
public void i_should_see_a_session_timeout_message() {
loginPage.isSessionTimeoutMessageDisplayed();
}
@Then("I should see an unexpected error message")
public void i_should_see_an_unexpected_error_message() {
loginPage.isUnexpectedErrorMessageDisplayed();
}
@When("I enter an invalid email format {string}")
public void i_enter_an_invalid_email_format(String email) {
loginPage.enterEmail(email);
}
@When("I enter an SQL injection in the email field")
public void i_enter_an_sql_injection_in_the_email_field() {
loginPage.enterEmail("' OR '1'='1");
}
@When("I enter an XSS attempt in the password field")
public void i_enter_an_xss_attempt_in_the_password_field() {
loginPage.enterPassword("<script>alert('XSS')</script>");
}
@Then("I should see an error message for SQL injection")
public void i_should_see_an_error_message_for_sql_injection() {
loginPage.isErrorMessageDisplayed();
}
@Then("I should see an error message for XSS attempt")
public void i_should_see_an_error_message_for_xss_attempt() {
loginPage.isErrorMessageDisplayed();
}
@When("I enter valid credentials after SQL injection attempt")
public void i_enter_valid_credentials_after_sql_injection_attempt(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials after SQL injection attempt
}
@When("I enter valid credentials after XSS attempt")
public void i_enter_valid_credentials_after_xss_attempt(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials after XSS attempt
}
@When("I enter valid credentials for an expired account")
public void i_enter_valid_credentials_for_an_expired_account(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials for an expired account
}
@When("I enter valid credentials for a locked account")
public void i_enter_valid_credentials_for_a_locked_account(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials for a locked account
}
@When("I enter valid credentials for an unverified account")
public void i_enter_valid_credentials_for_an_unverified_account(io.cucumber.datatable.DataTable dataTable) {
// Logic to enter valid credentials for an unverified account
}
//    @When("I enter valid credentials for a verified account")
//    @When("I enter valid credentials for an active account")

}