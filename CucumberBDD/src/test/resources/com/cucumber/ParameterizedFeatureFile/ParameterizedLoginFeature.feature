Feature: New Account Creation10

  Scenario: Validate First Name field10
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser

  Scenario: Validate create user multiple fields10
    Given User need to be on login page
    When User enters "John" First Name
    And User enters "Smith" Last Name
    Then User checks user First Name "John" is present
    And User checks user Last Name "Smith" is present
    But User mobile field should be blank
    Then Close the browser
