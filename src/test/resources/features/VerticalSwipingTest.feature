Feature: Vertical Swiping
  As an user
  I want to verify the functionality to reach the last option in the page

  Scenario: Verify that I can scroll until the end of the page
    Given I am on the Vertical Swiping screen
    When I scroll down until the end
    Then the last option is visible