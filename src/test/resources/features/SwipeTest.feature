Feature: Swipe Left/Right Functionality
  As a user
  I want to be able to swipe left and right in the Android application
  So that I can navigate between different elements

  Scenario: Swipe Left from Element 1 to Element 2 and then to Element 3
    Given I am on the swipe page
    When I swipe left from element 1
    And I swipe left from element 2
    Then I should see element 3

  Scenario: Swipe Right from Element 3 to Element 2 and then to Element 1
    Given I am on the swipe page
    When I swipe right from element 3
    And I swipe right from element 2
    Then I should see element 1