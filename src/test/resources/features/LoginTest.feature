Feature: Login Functionality
  As a user
  I want to be able to log in to the Android application
  So that I can use the application

  Background: 
    Given I am on the login screen

  Scenario: Successful login
    When I enter a valid username and password
    And I click the login button
    Then I should be redirected to the menu screen

  Scenario: Unsuccessful login
    When I enter an invalid username or password
    And I click the login button
    Then I should see an alert with an error message
