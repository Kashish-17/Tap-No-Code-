
package com.Tap_NoCode.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Tap_NoCode.utils.ElementUtils;
import org.junit.Assert;

public class LoginPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailInput")
    private WebElement emailInputField;

    @FindBy(id = "passwordInput")
    private WebElement passwordInputField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "sessionTimeoutMessage")
    private WebElement sessionTimeoutMessage;

    @FindBy(id = "userRole")
    private WebElement userRole;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailInputField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordInputField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserLoggedIn() {
        try {
            Assert.assertTrue("User not logged in", elementUtils.isElementDisplayed(homeScreen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isOnLoginPage() {
        try {
            Assert.assertTrue("Not on login page", elementUtils.isElementDisplayed(emailInputField));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorMessageDisplayed() {
        try {
            Assert.assertTrue("Error message not displayed", elementUtils.isElementDisplayed(errorMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSuccessMessageDisplayed() {
        try {
            Assert.assertTrue("Success message not displayed", elementUtils.isElementDisplayed(successMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isHomeScreenLoaded() {
        try {
            Assert.assertTrue("Home screen not loaded", elementUtils.isElementDisplayed(homeScreen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSessionTimeoutMessageDisplayed() {
        try {
            Assert.assertTrue("Session timeout message not displayed", elementUtils.isElementDisplayed(sessionTimeoutMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserRoleDisplayed() {
        try {
            Assert.assertTrue("User role not displayed", elementUtils.isElementDisplayed(userRole));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearEmailField() {
        try {
            elementUtils.clearElement(emailInputField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearPasswordField() {
        try {
            elementUtils.clearElement(passwordInputField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        // Implement logout functionality if applicable
    }
}