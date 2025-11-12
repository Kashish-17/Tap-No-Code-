Feature: Login with valid credentials
 As a registered user
 I want to successfully log in using valid credentials
 So that I can access the home screen

 Background:
  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  Then the login button should be enabled
  When I click the login button
  Then I should be redirected to the home screen
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible
 As a user
 I want to log in successfully with valid credentials and the "Remember Me" option checked
 So that my session persists after closing and reopening the application

  Given I am on the login page

 Scenario: Successful login with valid credentials and "Remember Me" checked
  When I enter a valid email "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  And I check the "Remember Me" checkbox
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: Session persistence after logout and reopening the application
  Given I am logged in
  When I log out of the application
  And I close and reopen the application
  Then I should be automatically logged back in
 As a registered user
 I want to log in using valid credentials on a mobile device
 So that I can access the home screen with all features available

  Given the application is installed on a mobile device

 Scenario: User logs in with valid credentials
  Given the application is opened successfully
  When I navigate to the login page
  And I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible
 As a user
 I want to log in successfully with valid credentials
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  Then the login button should be enabled
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible on the home screen
 As a registered user
 I want to log in successfully with valid credentials after performing a password reset
 So that I can access my account

  Given I am on the login page

 Scenario: User resets password and logs in successfully
  When I click on the "Forgot Password?" link
  And I enter "krishna@gmail.com" to receive a password reset link
  Then the password reset page is displayed
  And the email address is accepted for password reset
  When I check my email and follow the password reset link
  And I enter "NewValidPassword123" as my new password
  And I confirm "NewValidPassword123"
  Then the password is reset successfully
  And I am redirected back to the login page
  When I enter "krishna@gmail.com" in the email input field
  And I enter "NewValidPassword123" in the password input field
  Then I should be logged in successfully

 As a user
 I want to log in successfully with valid credentials
 So that I can access my account and be informed of session timeouts

  Given I am on the login page

 Scenario: Successful login with valid credentials
  When I enter a valid email "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: Session timeout after inactivity
  Given I am logged in successfully
  When I remain inactive for the session timeout duration
  And I attempt to navigate to another page
  Then I should be redirected to the login page
  And I should see the session timeout message

 As a user
 I want to log in with valid credentials
 So that I can access my account and navigate back to the login page if needed

  Given I am on the login page

 Scenario: User logs in successfully with valid credentials
  When I enter "krishna@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  And I click the login button
  Then I should see the home screen
  And the home screen should load without errors

 Scenario: User navigates back to the login page after logging in
  Given I have logged in successfully
  When I click the browser back button
  Then I should see the login page

 Scenario: User logs in again with the same valid credentials
  Given I am on the login page
  When I enter "krishna@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  And I click the login button
  Then I should see the home screen
  And the home screen should load without errors

 As a user
 I want to log in successfully with valid credentials
 So that I can access the application across different web browsers

  Given the application is available

 Scenario: Login in Chrome with valid credentials
  When I open the application in Chrome
  Then the application opens successfully in Chrome
  When I navigate to the login page
  Then the login page is displayed
  When I enter "krishna@gmail.com" in the email input field
  And I enter "ValidPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen loads without errors

 Scenario: Login in Firefox with valid credentials
  When I open the application in Firefox
  Then the application opens successfully in Firefox
  When I navigate to the login page
  Then the login page is displayed
  When I enter "krishna@gmail.com" in the email input field
  And I enter "ValidPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen loads without errors
 As a user
 I want to log in successfully with valid credentials on different devices
 So that I can access my account from any device

  Given the application is open

 Scenario: User logs in successfully on desktop
  Given I am on the login page
  When I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  And I click the login button
  Then I should see the home screen
  And I should be logged in successfully

 Scenario: User logs in successfully on tablet
  Given I am on the login page
  When I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  And I click the login button
  Then I should see the home screen
  And I should be logged in successfully
 As a user
 I want to log in successfully with valid credentials
 So that I can see the correct user role and other elements on the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "user@example.com"
  And I enter a valid password "password123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the correct user role should be displayed on the home screen
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully with valid credentials
 So that I can access the home screen and ensure session management works correctly

  Given I am on the login page

 Scenario: User logs in with valid credentials and manages session
  When I enter "krishna@gmail.com" in the email input field
  And I enter "ValidPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

  When I log out of the application
  And I attempt to access the home screen directly via URL
  Then I should be redirected to the login page

 As a user
 I want to log in successfully with valid credentials
 So that I can access the home screen with the Google Map displayed

  Given I am on the login page

 Scenario: User logs in with valid credentials and verifies password visibility
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  When I click the password visibility toggle
  Then the password should be visible
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed correctly

 As a user
 I want to log in with valid credentials
 So that I can access the application and ensure it behaves correctly after a browser refresh

  Given I am on the login page

 Scenario: User logs in successfully and verifies home screen after refresh
  When I enter a valid email "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  When I refresh the browser
  Then the home screen should remain displayed
  And the Google Map should still be visible

 As a user
 I want to log in successfully with valid credentials
 So that I can access my account while using multiple tabs in the browser

  Given the application is open in the first browser tab
  And I am on the login page

 Scenario: User logs in with valid credentials and verifies login status in multiple tabs
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  When I open a new tab and navigate to the application
  Then I should still be logged in on the first tab
 As a user
 I want to receive appropriate feedback upon successful login with valid credentials
 So that I can access the home screen

  Given I am on the login page

 Scenario: Successful login with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And a success message should be displayed
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen

 As a user
 I want to log in successfully with valid credentials
 So that I can access the home screen and ensure accessibility features are functional

  Given I am on the login page

 Scenario: User logs in with valid credentials
  When I enter a valid email address "krishna@gmail.com" in the email input field
  And I enter a valid password "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And all elements should be accessible via the screen reader
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen
 As a user
 I want to log in successfully with valid credentials
 So that my session persists across application restarts

  Given I am on the login page

 Scenario: User logs in with valid credentials and session persists
  When I enter "krishna@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

  When I close the application
  And I reopen the application
  Then I should still be logged in

 As a user
 I want to log in successfully with valid credentials
 So that I can access the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid complex password "ComplexP@ssw0rd!"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the Google Map should be displayed
  And the menu bar and recenter icon should be visible
  When I log out of the application
  Then I should be logged out successfully
 As a user
 I want to log in successfully with valid credentials
 So that I can access features based on my role

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "ValidPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And I should be able to access features based on my role
  And the Google Map should be displayed on the home screen
  And the menu bar and recenter icon should be visible
 As a user
 I want to log in with valid credentials
 So that I can access my account successfully

  Given I am on the login page

 Scenario: Successful login with valid credentials after handling unexpected error
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then an unexpected error occurs
  And an appropriate error message is displayed
  When the error resolves successfully
  And I click the login button again
  Then I should be logged in successfully
 As a user
 I want to receive appropriate feedback upon encountering errors during login
 So that I can understand what went wrong and correct it

  Given I am on the login page

 Scenario: User encounters an error with incorrect password
  Given I enter a valid email address "krishna@gmail.com"
  And I enter an incorrect password "wrongPassword"
  When I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: User logs in successfully after correcting the password
  Given I enter a valid email address "krishna@gmail.com"
  And I enter an incorrect password "wrongPassword"
  When I click the login button
  Then I should see an error message
  And the error message should be clear and informative
  When I correct the password
  And I click the login button again
  Then I should be logged in successfully

 As a user
 I want to log in successfully with valid credentials
 After requesting a password reset link

  Given I am on the login page

 Scenario: User logs in successfully after resetting password
  When I click on the "Forgot Password?" link
  And I enter a valid email address "krishna@gmail.com" to receive a password reset link
  Then the password reset page is displayed
  And the email address is accepted for password reset
  When I check my email and follow the password reset link
  And I enter a new valid password "NewPassword123" and confirm it
  Then the password is reset successfully
  And I am redirected back to the login page
  When I enter the valid email address "krishna@gmail.com" in the email input field
  And I enter the new valid password "NewPassword123" in the password input field
  Then I should be logged in successfully
 As a user
 I want to log in successfully with valid credentials
 So that I can access my account and be redirected to the login page after session expiration

  Given I am on the login page

 Scenario: Successful login with valid credentials
  When I enter a valid email "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  And I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors

 Scenario: Session expiration after inactivity
  Given I am logged in
  When I remain inactive for the session expiration duration
  And I attempt to navigate to another page
  Then I should be redirected to the login page
  And the session expiration should be handled correctly
 As a user
 I want to log in successfully with valid credentials
 So that I can see the correct user role and other elements on the home screen

  Given I am on the login page

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "user@example.com"
  And I enter a valid password "securePassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And the correct user role should be displayed on the home screen
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen
 As a user
 I want to receive appropriate feedback upon successful login with valid credentials
 So that I can access the home screen and its features

  Given I am on the login page

 Scenario: Successful login with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should be logged in successfully
  And the home screen should load without errors
  And a success message should be displayed
  And the Google Map should be displayed correctly
  And the menu bar and recenter icon should be visible on the home screen
 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with an invalid email format
  Given I enter an invalid email format "abc@"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: User can log in after correcting the email format
  Given I enter a valid email format "abc@example.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should be logged in successfully
 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with a valid email and incorrect password
  Given I enter a valid email "krishna@gmail.com"
  And I enter an incorrect password "wrongPassword"
  When I click the login button
  Then an error message should be displayed
  And the error message should be clear and informative

 Scenario: User logs in with the correct password after an error
  Given I enter a valid email "krishna@gmail.com"
  And I enter an incorrect password "wrongPassword"
  When I click the login button
  Then an error message should be displayed
  And the error message should be clear and informative
  When I correct the password
  And I click the login button again
  Then I should be logged in successfully
 As a user
 I want to log in to my account
 So that I can access my dashboard

  Given I am on the login page

 Scenario: User cannot log in with an empty email field
  Given the email input field is empty
  And I enter "validPassword123" in the password input field
  When I click the login button
  Then an error message should be displayed
  And the error message should be clear and informative

 Scenario: User can log in with valid credentials
  Given I enter "user@example.com" in the email input field
  And I enter "validPassword123" in the password input field
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in to my account
 So that I can access my dashboard

  Given I am on the login page

 Scenario: User cannot log in with an empty password field
  Given I enter a valid email address "krishna@gmail.com"
  And I leave the password input field empty
  When I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: User logs in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with empty email and password fields
  Given both email and password fields are empty
  When I click the login button
  Then an error message should be displayed
  And the error message should be clear and informative

 Scenario: User can log in with valid credentials
  Given I have entered valid credentials
  When I click the login button
  Then the home screen should load without errors

 As a user
 I want to ensure that I cannot log in with an SQL injection attempt
 So that I receive an appropriate error message

  Given I am on the login page

 Scenario: Attempt to log in with SQL injection in the email field
  When I enter the email "' OR '1'='1" in the email input field
  And I enter the password "validPassword123" in the password input field
  And I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: Log in with valid credentials after SQL injection attempt
  Given I have seen the error message
  When I enter the email "validUser@example.com" in the email input field
  And I enter the password "validPassword123" in the password input field
  And I click the login button
  Then I should be logged in successfully

 As a user
 I want to ensure that I cannot log in with an XSS attempt in the password field
 So that I receive an appropriate error message

  Given I am on the login page

 Scenario: Attempt to log in with an XSS attempt in the password field
  Given I enter a valid email address "krishna@gmail.com"
  When I enter an XSS attempt "<script>alert('XSS')</script>" in the password field
  And I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: Log in with valid credentials after XSS attempt
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to verify that I cannot log in with valid credentials if my account is expired
 So that I receive an appropriate error message

  Given I am on the login page

 Scenario: User attempts to log in with expired account credentials
  Given I enter "expired_user@gmail.com" in the email input field
  And I enter "ValidPassword123" in the password input field
  When I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: User logs in with active account credentials
  Given I enter valid credentials for an active account
   | email        | password     |
   | active_user@gmail.com| ValidPassword123 |
  When I click the login button
  Then I should be logged in successfully

 As a user
 I want to verify that I cannot log in with valid credentials if my account is locked
 So that I receive an appropriate error message

  Given the user has a locked account with email "locked_user@gmail.com" and password "validPassword123"

 Scenario: Attempt to log in with locked account
  Given I navigate to the login page
  When I enter "locked_user@gmail.com" in the email input field
  And I enter "validPassword123" in the password input field
  And I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: Attempt to log in with active account
  Given I have valid credentials for an active account
  When I enter the valid email in the email input field
  And I enter the valid password in the password input field
  And I click the login button
  Then I should be logged in successfully

 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with valid credentials if the account is not verified
  Given I enter a valid email address "krishna@gmail.com" for an unverified account
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should see an error message
  And the error message should be clear and informative

 Scenario: User can log in with valid credentials if the account is verified
  Given I enter valid credentials for a verified account
  And I enter a valid email address "verifiedUser@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  Then I should be logged in successfully
 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with valid credentials due to server error
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  And a server error occurs
  Then an error message should be displayed
  And the error message should be clear and informative

 Scenario: User retries logging in with valid credentials
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  And a server error occurs
  And I enter the valid credentials again
  Then I should be able to log in successfully

 As a user
 I want to log in with valid credentials
 So that I can access my account

  Given I am on the login page

 Scenario: User cannot log in with valid credentials due to network error
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  And a network error occurs
  Then an error message should be displayed
  And the error message should be clear and informative

 Scenario: User retries logging in after network error
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  And a network error occurs
  And I enter valid credentials again
  Then I should be able to log in successfully

 As a user
 I want to ensure that I cannot log in with valid credentials if the session has timed out
 So that I receive an appropriate error message

  Given I am on the login page

 Scenario: User attempts to log in with valid credentials after session timeout
  Given I enter a valid email address "krishna@gmail.com"
  And I enter a valid password "validPassword123"
  When I click the login button
  And I wait for the session to timeout
  And I attempt to navigate to another page
  Then I should be redirected to the login page
  And I should see a session timeout message
