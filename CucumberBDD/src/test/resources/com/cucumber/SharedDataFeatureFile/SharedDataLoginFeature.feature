Feature: New Account Creation11

  Scenario: Validate First Name field11
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present

  Scenario: Validate create user multiple fields11
    Given User need to be on login page
    When User enters "John" First Name
    Then User checks user First Name "John" is present
    And User enters "Smith" Last Name
    Then User checks user Last Name "Smith" is present
    But User mobile field should be blank
