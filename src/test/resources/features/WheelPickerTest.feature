Feature: Dropdown Color Selection
  As a user
  I want to be able to select a color from a dropdown
  So that the text changes according to the selected color

  Scenario: Select Different Colors from Dropdown
    Given I am on the color page
    When I select "Red" from the color dropdown
    Then the text should change to red

    When I select "Green" from the color dropdown
    Then the text should change to green

    When I select "Blue" from the color dropdown
    Then the text should change to blue

    When I select "Black" from the color dropdown
    Then the text should change to black