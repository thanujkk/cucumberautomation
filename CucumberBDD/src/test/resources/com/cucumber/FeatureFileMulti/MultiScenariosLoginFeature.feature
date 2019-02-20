Feature: New Account Creation4

  Scenario: Validate First Name field4
    Given User need to be on login page
    When User enters First Name
    Then User checks user First Name is present
    Then Close the browser

  Scenario: Validate create user multiple fields4
    Given User need to be on login page
    When User enters First Name
    And User enters Last Name
    Then User checks user First Name is present
    And User checks user Last Name is present
    But User mobile field should be blank
    Then Close the browser
