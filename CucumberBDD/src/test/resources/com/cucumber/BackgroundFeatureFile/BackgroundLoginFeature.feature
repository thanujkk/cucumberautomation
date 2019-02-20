Feature: New Account Creation1

  Background: Common steps1
    Given User need to be on login page

  Scenario: Validate First Name field1
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser

  Scenario: Validate create user multiple fields1
    When User enters "John" First Name
    And User enters "Smith" Last Name
    Then User checks user First Name "John" is present
    And User checks user Last Name "Smith" is present
    But User mobile field should be blank
    Then Close the browser
