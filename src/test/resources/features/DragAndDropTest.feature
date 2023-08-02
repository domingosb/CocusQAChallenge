Feature: Drag and Drop Functionality
  As a user
  I want to be able to drag and drop elements

  Scenario: Drag and Drop an element
    Given I am on the drag and drop page
    When I drag element "Drag Me!" and drop it onto element "Drop here!"
    Then the element is dropped