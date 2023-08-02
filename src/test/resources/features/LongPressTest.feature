Feature: Long Press Functionality
  As a user
  I want to be able to long press an element

  Scenario: Long press an element
    Given I am on the long press page
    When I long press "Long Press Me" button
    Then a message appears