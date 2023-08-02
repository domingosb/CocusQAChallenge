Feature: Slider Functionality
  As an user
  I want to verify the functionality of a slider
  So that I can ensure it works correctly

  Scenario: Verify slider value is updated correctly
    Given I am on the slider screen
    When I drag the slider to the middle
    Then the slider value should be updated to "50"

  Scenario: Verify slider minimum value
    Given I am on the slider screen
    When I drag the slider to the left
    Then the slider value should be updated to "0"

  Scenario: Verify slider maximum value
    Given I am on the slider screen
    When I drag the slider to the right
    Then the slider value should be updated to "128"