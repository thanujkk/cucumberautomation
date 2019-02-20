Feature: New Account Creation5

  Scenario: Validate First Name field5
    Given User need to be on login page
    When User enters First Name
    Then User checks user First Name is present
    Then Close the browser