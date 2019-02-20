Feature: New Account Creation3

  Scenario: Validate create user multiple fields3
    Given User need to be on login page
    When Enter the following data
      | firstName | lastName | mobile |
      | Tony      | Reid     |   1234 |
      | John      | Peter    |   2345 |
    Then Close the browser
