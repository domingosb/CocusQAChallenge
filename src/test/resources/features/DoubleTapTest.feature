Feature: Double Tap Functionality
  As a user
  I want to be able to double tap an element

  Scenario: Double tap an element
    Given I am on the double tap page
    When I double tap "Double Tap Me" button
    Then a successful message appears