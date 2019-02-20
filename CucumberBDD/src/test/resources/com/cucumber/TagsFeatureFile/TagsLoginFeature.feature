@Important
Feature: New Account Creation12

  @Smoke
  Scenario: Validate First Name field13
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser

  @Regression
  Scenario: Validate create user multiple fields14
    Given User need to be on login page
    When User enters "John" First Name
    And User enters "Smith" Last Name
    Then User checks user First Name "John" is present
    And User checks user Last Name "Smith" is present
    But User mobile field should be blank
    Then Close the browser

  @Smoke @Regression
  Scenario: Validate First Name field15
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser

  Scenario: Validate First Name field16
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser

  @Regression
  Scenario: Validate First Name field17
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser

  @Smoke
  Scenario: Validate First Name field18
    Given User need to be on login page
    When User enters "David" First Name
    Then User checks user First Name "David" is present
    Then Close the browser
