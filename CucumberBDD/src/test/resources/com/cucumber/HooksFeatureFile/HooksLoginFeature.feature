Feature: New Account Creation6

  Scenario: Validate First Name field6
    When User enters "David" First Name
    Then User checks user First Name "David" is present

  Scenario: Validate create user multiple fields6
    When User enters "John" First Name
    And User enters "Smith" Last Name
    Then User checks user First Name "John" is present
    And User checks user Last Name "Smith" is present
    But User mobile field should be blank
